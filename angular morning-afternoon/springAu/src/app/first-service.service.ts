import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FirstServiceService {

  constructor(private getid:HttpClient) { }
}
