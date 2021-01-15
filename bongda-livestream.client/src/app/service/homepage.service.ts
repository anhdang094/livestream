/**
 * Created by Administrator on 08/06/2017.
 */
import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class HomePageService extends HttpService {


  constructor(httpClient: HttpClient) {
    super(httpClient);
  }

  public getUser(): any {
    return this.getAPI('/api/test');
  }
}
