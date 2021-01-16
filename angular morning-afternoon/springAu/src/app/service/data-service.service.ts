import { Injectable } from '@angular/core';

import {HttpClient} from '@angular/common/http';
import { observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
      data:number=0;
      
  constructor(private http:HttpClient) { }

  setdata(data:number)
  {
    this.data=data;
    console.log(this.data);
    console.log("me");
  }
  
  getData() {
    const url = 'https://jsonplaceholder.typicode.com/todos';
    return this.http.get(url);
  }
 
  getDetailData()
    {
      const url=`https://jsonplaceholder.typicode.com/todos/${this.data}`;
      console.log("me");
      return  this.http.get(url);
      
    }

  
}
