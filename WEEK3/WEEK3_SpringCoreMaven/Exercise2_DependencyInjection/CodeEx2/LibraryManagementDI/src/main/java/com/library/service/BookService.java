package com.library.service;

import com.library.repository.BookRepository;
 
public class BookService {
       private BookRepository bookrepository;
       
       public BookService() {
   		System.out.println("Book Service bean is now created");
   	   }
       // dependency injection setter
       public void setBookRepository(BookRepository bookrepository) {
    	   this.bookrepository = bookrepository;
    	   System.out.println("Setter method is called and BookRepository reference is Injected into BookService.");
       }
}
