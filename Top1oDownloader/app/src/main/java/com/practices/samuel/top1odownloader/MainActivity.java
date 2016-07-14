package com.practices.samuel.top1odownloader;

import android.os.AsyncTask;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class MainActivity extends AppCompatActivity {
    private Button btnParse;
    private ListView listApps;
    private String mFileContents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        DownloadData dt = new  DownloadData();
        dt.execute("http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml");
        btnParse = (Button)findViewById(R.id.btnParse);
        listApps = (ListView)findViewById(R.id.xmlListView);

        btnParse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            XmlParser parser = new XmlParser(mFileContents);
                parser.process();
                ArrayAdapter<App> arrayAdapter = new ArrayAdapter<App>(
                        MainActivity.this,R.layout.list_item,parser.getApps());
                listApps.setAdapter(arrayAdapter);
            }
        });

    }




    private class DownloadData extends AsyncTask<String,Void,String>{


        @Override
        protected String doInBackground(String... params) {
            mFileContents = downloadXMLFile(params[0]);
            if(mFileContents == null){
                Log.d("DownloadData","Error Downloading");
            }
            return mFileContents;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Log.d("DownloadData","onPostExecute result " + result);
        }

        private String downloadXMLFile(String urlPath){
           StringBuilder tempBuffer = new StringBuilder();
            try{
                String feedData;
                URL url = new URL(urlPath);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

                // Log.d("Data ","this is the data "+tempBuffer.toString());
                while((feedData = in.readLine()) != null)
                    tempBuffer.append(feedData +"\n");

                in.close();
                return tempBuffer.toString();
            }catch(IOException e){

             Log.d("DownloadData","IO Exception reading data"+e.getMessage());
              //  throw e;
            }catch(SecurityException e){
                Log.d("DownloadData","Security exception "+e.getMessage());
            }

          return "test";
        }


    }
}
