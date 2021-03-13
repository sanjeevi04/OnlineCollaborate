import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from "@angular/common";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {DataTablesModule} from 'angular-datatables';
import {FormsModule,ReactiveFormsModule} from  '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {HttpClientModule} from '@angular/common/http'; 
import { RegisterUserComponent } from './register-user/register-user.component';
import { UserListComponent } from './user-list/user-list.component';
import { LoginUserComponent } from './login-user/login-user.component';
import { RouterLinkWithHref, RouterModule } from '@angular/router';
import { ActiveUserComponent } from './active-user/active-user.component';
import { BlogListComponent } from './blog-list/blog-list.component';
 import { MatToolbarModule } from '@angular/material/toolbar';
 import { MatButtonModule } from '@angular/material/button';
 import { MatSidenavModule } from '@angular/material/sidenav';
 import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { HomeComponent } from './home/home.component';
import { LayoutModule } from '@angular/cdk/layout';
import { NavComponent } from './nav/nav.component';
import { NavigationComponent } from './navigation/navigation.component';
import { NavigationUserComponent } from './navigation-user/navigation-user.component';
import { UserProfileComponent } from './user-profile/user-profile.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterUserComponent,
    UserListComponent,
    LoginUserComponent,
    ActiveUserComponent,
    BlogListComponent,
    
    HomeComponent,
    
    NavComponent,
    
    NavigationComponent,
    
    NavigationUserComponent,
    
    UserProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    DataTablesModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule,BrowserAnimationsModule, LayoutModule, MatToolbarModule, MatButtonModule, MatSidenavModule, MatIconModule, MatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
