import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterUserComponent } from './register-user/register-user.component';
import { UserListComponent } from './user-list/user-list.component';
import { LoginUserComponent } from './login-user/login-user.component';
import {ActiveUserComponent} from './active-user/active-user.component';
import {BlogListComponent } from './blog-list/blog-list.component';
import { HomeComponent } from './home/home.component';
import { NavigationComponent } from './navigation/navigation.component';
import { NavigationUserComponent } from './navigation-user/navigation-user.component';
import {UserProfileComponent} from './user-profile/user-profile.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {path:'home', component: HomeComponent},
  {path:'nav/:Id', component:NavigationComponent, 
  children: [
    { path: 'user-list', component: UserListComponent },
    { path: 'active-user' , component: ActiveUserComponent},
  { path: 'blog-list' , component: BlogListComponent},
  { path: 'user-profile/:Id' , component: UserProfileComponent}  
  ]
} ,
  {path:'nav-user/:Id', component:NavigationUserComponent,
   children:[
    { path: 'blog-list' , component: BlogListComponent},
    { path: 'user-profile/:Id' , component: UserProfileComponent}
   ]
},
  { path: 'register-user', component: RegisterUserComponent },
  { path: 'login-user' , component: LoginUserComponent} ,
   
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
