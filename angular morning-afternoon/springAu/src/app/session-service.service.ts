import { Injectable } from '@angular/core';
import {SessionModel} from '../app/modles/SessionModel';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SessionServiceService {

  constructor(private http:HttpClient) { }

  getsessionList(){
    return this.sessions;
  }
  sessions:SessionModel[]=[
    {
      name: 'angular',
      trainer: 'Sharanya',
      tDate:new Date()
    },
    {
      name: 'spring',
      trainer: 'Aravind',
      tDate:new Date()
    },
   

  ];
 
 
 

  getData() {
    const url = 'https://jsonplaceholder.typicode.com/todos';
    return this.http.get(url);
  }
  
}
