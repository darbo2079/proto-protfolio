import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GroupsDetailsComponent } from './components/groups-details/groups-details/groups-details.component';
import { GroupsComponent } from './components/groups/groups/groups.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login/login.component';
import { LogregComponent } from './components/logreg/logreg.component';
import { ProfileComponent } from './components/profile/profile/profile.component';
import { RegisterComponent } from './components/register/register/register.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'groups', component: GroupsComponent },
  { path: 'login', component: LogregComponent },
  { path: 'register', component: LogregComponent },
  { path: 'groups-details/:groupId', component: GroupsDetailsComponent },

  // { path: 'profile', component: ProfileComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
