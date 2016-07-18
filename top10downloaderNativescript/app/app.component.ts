import {Component} from "@angular/core";
import {APIService} from "./API.service";
import {App} from "./app";
@Component({
    selector: "my-app",
    templateUrl: "app.component.html",
    providers:[APIService]
})
export class AppComponent {
    appsList: Array<App> = [];
    actualLimit:number=0;
    constructor(private _api:APIService){

    }

    public onTap(limit:number) {
     this.actualLimit = limit;
     this.appsList = [];
     var appsPromise = this._api.getTopDownloadedApps(limit);
        appsPromise.then((data)=>{
            data.forEach(app =>{            
                this.appsList.push(app);
            })
        })
    }
    public getInfo(id:string) {
        this._api.getAppDescription(id,this.actualLimit)
               .then((data)=>{
                      alert(data.summary);
               });
    }

}
