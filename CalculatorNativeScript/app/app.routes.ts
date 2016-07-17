import {RouterConfig} from "@angular/router";
import {nsProvideRouter} from "nativescript-angular/router"
import {SimpleCalculatorPage} from "./calculator.component";

export const routes: RouterConfig = [
  { path: "", component: SimpleCalculatorPage }
];

export const APP_ROUTER_PROVIDERS = [
  nsProvideRouter(routes, {})
];