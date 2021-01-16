import { Component, OnInit } from '@angular/core';
import {SessionModel} from '.././modles/SessionModel';
import { SessionServiceService } from '../session-service.service';
import {HttpClient} from '@angular/common/http';
import { analyzeAndValidateNgModules } from '@angular/compiler';


@Component({
  selector: 'app-session',
  templateUrl: './session.component.html',
  styleUrls: ['./session.component.scss']
})
export class SessionComponent implements OnInit {
  sessioncc:string="data passwed from session component";

  display = false;
  firstName =new SessionModel();
  // sessions:SessionModel[]=[
  //     {
  //       name: 'angular',
  //       trainer: 'Sharanya'
  //     },
  //     {
  //       name: 'spring',
  //       trainer: 'Aravind'
  //     }
  //   ];
 sessions:SessionModel[];
        data : any;
     selectedsession=new SessionModel();
  constructor(private service:SessionServiceService) { 
    this.sessions=this.service.getsessionList();
    this.data=this.service.getData();
  }

  ngOnInit(): void {
  }
  // onselect(session:SessionModel)
  // {
  //   alert(session.name);
  //   this.selectedsession=session;
  // }

  addsession(addName:string,addTrainer:string,addDate:string)
  {
    var newAdd={
      name:addName,
      trainer:addTrainer,
      tDate:new Date(addDate)
    }
    console.log(newAdd);
    this.sessions.push(newAdd);
      
  }
  editSession(session:SessionModel,name:string,trainer:string,tDate:string)
  {
      session.name=name;
      session.trainer=trainer;
      session.tDate=new Date(tDate);
  }

  deleteSession(session:SessionModel)
  {
    this.sessions=this.sessions.filter(t=>t.name!=session.name);
    this.display=false;
  }

  showDetail(session:SessionModel)
  {
    
    this.display=true;
    this.firstName = session;
    
    
  }


  getApiValue(){
    
    this.data.getData().subscribe((item:any)=>{
      console.log(item);
    });
  }



}
