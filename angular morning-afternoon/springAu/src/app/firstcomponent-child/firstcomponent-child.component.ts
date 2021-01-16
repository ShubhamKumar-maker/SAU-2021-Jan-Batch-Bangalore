import { Component, OnInit,Input } from '@angular/core';
import {DataServiceService}from '../service/data-service.service';

@Component({
  selector: 'app-firstcomponent-child',
  templateUrl: './firstcomponent-child.component.html',
  styleUrls: ['./firstcomponent-child.component.scss']
})
export class FirstcomponentChildComponent implements OnInit {
    @Input() detail:any={};
  constructor(private getdetail:DataServiceService) {
   

   }

  ngOnInit(): void {
     
    
      

  }
  myfun(){
    
   console.log("first");

  }

}
