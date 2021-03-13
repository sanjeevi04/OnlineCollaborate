import { Component, OnInit } from '@angular/core';
import { Blog } from '../blog';
import { BlogService } from '../blog.service';
import { Observable, Subject } from 'rxjs';
import { Validators, FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { DataTablesModule } from 'angular-datatables';

@Component({
  selector: 'app-blog-list',
  templateUrl: './blog-list.component.html',
  styleUrls: ['./blog-list.component.scss']
})
export class BlogListComponent implements OnInit {

  // title='Blogs' ;
  // blog: Blog = new Blog();
  // error!: String;

  
 // constructor(private blogService:BlogService) { }
// constructor(){}

//   ngOnInit(): void {
//     // this.blogService.getBlogList().subscribe(
//     //   (data:Blog) => this.blog = data,
//     //   (      error: String) => this.error = error
//     // );
//   }
constructor(private blogservice: BlogService) { }
  blog: Blog =new Blog();
  submitted = false;
  ngOnInit(): void {
    this.submitted = false;
  }
}

