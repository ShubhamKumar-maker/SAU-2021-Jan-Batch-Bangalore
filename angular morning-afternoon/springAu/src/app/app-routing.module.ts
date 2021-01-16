import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FirstcomponentComponent } from './firstcomponent/firstcomponent.component';
import { SecondcomponentComponent } from './secondcomponent/secondcomponent.component';
import { SessionComponent} from './session/session.component';



const routes: Routes = [
  { path: 'app-firstcomponent', component: FirstcomponentComponent },
  { path: 'secondcomponent', component: SecondcomponentComponent },
  {path:'sessionC', component:SessionComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
