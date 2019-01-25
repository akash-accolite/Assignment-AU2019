import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/provider/book-service.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
   book: any = [];
  books:any=[];
  id:number;
  title:string;
  desc :string;

  constructor( private bookService:BookServiceService ) { }

  ngOnInit() {
  // this.bookService.getBookById().subscribe((response)=>{
  //   if(response){
  //     this.book=response;
  //   }
 // });
this.bookService.getAllBooks().subscribe((response)=>
    {
      console.log(response);
    if(response && response.length>0){
      this.books=response;
    }
    });

  //this.book=new Book();
  }

  // postData(){
  //   this.bookService.addBook(this.book).subscribe()
  // }

  posttheData(obj){
    // let book =new Book(this.id,this.title,this.desc,this.author,this.price);
    console.log(obj);

    this.bookService.addtheBook(obj).subscribe((response)=>{
      //console.log(response);
      //console.log(obj);
      alert("Book added");
      
    });
  }
}
