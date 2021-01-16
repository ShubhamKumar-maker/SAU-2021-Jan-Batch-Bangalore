import { Component } from '@angular/core';
import { Routes, RouterModule, ChildActivationEnd } from '@angular/router'; 
import { NgModule } from '@angular/core';


const routes: Routes = [
 
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'springAu';
}
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class App { }