import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/provider/book-service.service';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
  books: any = [];

  constructor(private bookService:BookServiceService) { }

  ngOnInit() {

    this.bookService.gettheBooks().subscribe((response)=>
    {
      console.log(response);
    if(response && response.length>0){
      this.books=response;
    }
    });
  }

}
