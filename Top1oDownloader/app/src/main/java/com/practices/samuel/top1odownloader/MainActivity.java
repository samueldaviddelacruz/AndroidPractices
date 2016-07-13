package com.practices.samuel.top1odownloader;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
private TextView xmlTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        DownloadData dt = new  DownloadData();
        dt.execute("http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml");
        xmlTextView = (TextView)findViewById(R.id.xmlTextView);


    }




    private class DownloadData extends AsyncTask<String,Void,String>{

        private String mFileContents;
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
            xmlTextView.setText(result);
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
