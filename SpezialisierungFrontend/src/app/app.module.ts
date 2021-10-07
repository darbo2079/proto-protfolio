import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login/login.component';
import { RegisterComponent } from './components/register/register/register.component';
import { GroupsComponent } from './components/groups/groups/groups.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { MaterialModule } from "./material/material/material.module";
import { ProfileComponent } from './components/profile/profile/profile.component';
import { CardsGroupComponent } from './shared/cards/cards/cards-group/cards-group.component';
import { ContentGroupComponent } from './shared/content/content-group/content-group.component';
import { GroupListService } from './services/group-list.service'
import { HttpClientModule } from '@angular/common/http';
import { FlexLayoutModule } from '@angular/flex-layout';
import { GroupsDetailsComponent } from './components/groups-details/groups-details/groups-details.component';
import { GroupsAboutComponent } from './components/groups-details/groups-about/groups-about.component';
import { GroupsMessageboardComponent } from './components/groups-details/groups-messageboard/groups-messageboard.component';
import { GroupsResourcesComponent } from './components/groups-details/groups-resources/groups-resources.component';
import { GroupsMembersComponent } from './components/groups-details/groups-members/groups-members.component';
import { LogregComponent } from './components/logreg/logreg.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    GroupsComponent,
    NavbarComponent,
    ProfileComponent,
    CardsGroupComponent,
    ContentGroupComponent,
    GroupsDetailsComponent,
    GroupsAboutComponent,
    GroupsMessageboardComponent,
    GroupsResourcesComponent,
    GroupsMembersComponent,
    LogregComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule,
    FlexLayoutModule

  ],
  providers: [GroupListService],
  bootstrap: [AppComponent]
})
export class AppModule { }
