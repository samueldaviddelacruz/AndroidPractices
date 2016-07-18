import { Injectable } from '@angular/core';
import 'rxjs/add/operator/toPromise';
import { Headers, Http } from '@angular/http';
import {App} from "./app"; 
//declare var X2JS: any;
var X2JS = require('x2js')


@Injectable()
export class APIService {

  constructor(private http: Http) {

   }

  getTopDownloadedApps(limit:number):Promise<App[]>{
    // URL to web api(response)=> { return this.parseXmlToJson(response.text())}
    return this.getHttpPromise(limit)
               .then(this.getResponseText)
               .then(this.parseXmlToJson)
               .then(this.getFilledAppList)
               .catch(this.handleError);
  }

  getAppDescription(id:string,limit:number){
          return this.getHttpPromise(limit)
               .then(this.getResponseText)
               .then(this.parseXmlToJson)
               .then(this.findMatchInJson(id))
               .catch(this.handleError);


  }
  private findMatchInJson(id:string){
    return (jsonDoc:any) => {
    var match;
          jsonDoc.feed.entry.forEach(entry => {
            if(entry.id["_im:id"] === id){
              console.log(JSON.stringify(entry));
              match = entry;
              return;
           }
       })
     return match;     
    }                    
  } 
  private getHttpPromise(limit:number){
      return this.http.get(this.getAPIUrl(limit))
               .toPromise();
  }
  private getResponseText(Response:any){

    return Response.text();
  }
  private getAPIUrl(limit:number):string{
   var xmlUrl = `http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=${limit}/xml`; 
   return xmlUrl;
  }
  private parseXmlToJson(xml):any{
               //var xml = response.text();
               var x2js  = new X2JS();
               var json = x2js.xml2js(xml);  
   return json;
  } 
    
  private getFilledAppList(document:any){
       let appsList: Array<App> = [];
       document.feed.entry.forEach(entry => {
       console.log(JSON.stringify(entry.id))
       appsList.push(new App(entry.id["_im:id"],entry.title,entry.updated))
     })
   return appsList;
  }
 
	private handleError(error: any) {
	  console.error('An error occurred', error);
	  return Promise.reject(error.message || error);
	}

  


}