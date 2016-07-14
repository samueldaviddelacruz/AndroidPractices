package com.practices.samuel.top1odownloader;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.util.ArrayList;


/**
 * Created by samuel on 7/14/16.
 */
public class XmlParser {
    private String XmlData;
    private ArrayList<App>  apps;

    public XmlParser(String xmlData) {
        XmlData = xmlData;
        apps = new ArrayList<>();
    }

    public ArrayList<App> getApps() {
        return apps;
    }

    public void process(){
        boolean inEntry = false;
        String textValue = "";
        App currentApp = null;
        try
        {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new StringReader(XmlData));
            int eventType = xpp.getEventType();
            while(eventType != XmlPullParser.END_DOCUMENT){
                     String tagName = "";
                     tagName = xpp.getName();
                    switch(eventType){
                        case XmlPullParser.START_TAG:

                            if(tagName.equalsIgnoreCase("entry")){
                                inEntry = true;
                                currentApp = new App();

                            }
                            break;
                        case XmlPullParser.TEXT:
                            textValue = xpp.getText();
                            break;
                        case XmlPullParser.END_TAG:
                           if(inEntry){



                                if(tagName.equalsIgnoreCase("entry")){
                                    apps.add(currentApp);
                                    inEntry = false;
                                }
                               if(tagName.equalsIgnoreCase("name")){
                                   currentApp.name =textValue;
                               }
                               if(tagName.equalsIgnoreCase("artist")){
                                   currentApp.artist =textValue;
                               }
                               if(tagName.equalsIgnoreCase("releaseDate")){
                                   currentApp.releaseDate =textValue;
                               }


                           }



                            break;

                        default:
                    }
                eventType=xpp.next();
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        for (App app :apps) {

            Log.d("XmlParser", "Appp Name "+ app.name);

        }

    }

}
