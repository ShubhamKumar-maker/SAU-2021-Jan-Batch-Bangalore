import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SessionComponent } from './session/session.component';
import {FormsModule} from '@angular/forms';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import {HttpClientModule} from '@angular/common/http';
import { FirstcomponentComponent } from './firstcomponent/firstcomponent.component';
import { SecondcomponentComponent } from './secondcomponent/secondcomponent.component';
import { SessionListComponent } from './session-list/session-list.component';
import{ DataServiceService}from'./service/data-service.service';
import { FirstcomponentChildComponent } from './firstcomponent-child/firstcomponent-child.component';


@NgModule({
  declarations: [
    AppComponent,
    SessionComponent,
    ParentComponent,
    ChildComponent,
    FirstcomponentComponent,
    SecondcomponentComponent,
    SessionListComponent,
    FirstcomponentChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  
  ],
  providers: [DataServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
