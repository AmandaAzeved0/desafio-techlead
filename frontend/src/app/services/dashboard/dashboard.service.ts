import { Injectable } from '@angular/core';
import {environment} from "../../../environments/enironments";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  url= environment.apiUrl;

  constructor(private httpClient: HttpClient) {}

  getDetalais(){
    return this.httpClient.get(this.url + 'usuario');
  }

}
