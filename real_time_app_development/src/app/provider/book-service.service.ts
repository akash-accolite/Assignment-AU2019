import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Observer } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  constructor(private http:HttpClient) { }

getAllBooks():Observable<any> {
  return this.http.get('/library/books');
}
getBookById() : Observable<any>{
  return this.http.get('/library/books/1/get');
}  

addBook(book: any):Observable<any>{
  return this.http.post('/library/books',book);
}

addtheBook(book: any):Observable<any>{
  return this.http.post('/library/carts',book);
}

gettheBooks():Observable<any>{
  return this.http.get('/library/getcart');
  
}

}
