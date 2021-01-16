import { Component, OnInit,Input} from '@angular/core';
import { SessionModel } from '../modles/SessionModel';


@Component({
  selector: 'app-session-list',
  templateUrl: './session-list.component.html',
  styleUrls: ['./session-list.component.scss']
})
export class SessionListComponent implements OnInit {
  
  @Input() firstName=new SessionModel();
  constructor() { }

  ngOnInit(): void {
  }

}
