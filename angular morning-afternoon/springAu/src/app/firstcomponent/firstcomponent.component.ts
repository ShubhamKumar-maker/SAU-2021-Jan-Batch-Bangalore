import { Component, OnInit } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'; 
import {DataServiceService}from '../service/data-service.service'
import {apimdl} from '../modles/apimodle'
@Component({
  selector: 'app-firstcomponent',
  templateUrl: './firstcomponent.component.html',
  styleUrls: ['./firstcomponent.component.scss']
})


export class FirstcomponentComponent implements OnInit {
  display=false;

 // id=1;

  constructor(private post:DataServiceService) { 
    // this.post.setdata(this.id);

  }
  
 
posts :any={};
destailp:any={};
  ngOnInit(): void {
    this.post.getData().subscribe((res)=>{
      console.log(res)
      this.posts=res;
      
    });
 
    
  }

  getDetailData(id:number)
  {
      this.display=true;
     // this.id=id;
     // console.log(this.id);
     console.log(id);
      this.post.setdata(id);
  }
  myfun(){
   
    this.post.getDetailData().subscribe((res)=>{
      console.log(res);
      this.destailp=res;
    })
    console.log("calling me");
  }



}
