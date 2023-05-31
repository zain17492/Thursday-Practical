package com.program.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.program.entity.Book;
import com.program.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBook()
	{
		List<Book> list=bookservice.getAllBooks();
		if(list.size()<=0)
  {
	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
  }
    return ResponseEntity.of(Optional.of(list));
}
	

@GetMapping("/books/{id}")
public ResponseEntity <Book> getBook(@PathVariable("id") int id)
{
Book book=bookservice.getById(id);
if(book==null)
{
	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
}
    return ResponseEntity.of(Optional.of(book));
}

@PostMapping("/books")
public ResponseEntity<Book> addBook(@RequestBody Book book)
{
	Book b=null;
	try {
			b=this.bookservice.addBook(book);
			System.out.println(b);
			return ResponseEntity.of(Optional.of(b));
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
}

@DeleteMapping("/books/{bookid}")
public ResponseEntity<Void> deleteBook(@PathVariable("bookid") int id)
{
	try {
			this.bookservice.deleteBook(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	
}
@PutMapping("/books/{bookid}")
public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable ("bookid") int bookId)
{
	try {
		this.bookservice.updateBook(book, bookId);
		return ResponseEntity.status(HttpStatus.OK).body(book);
	}
	catch(Exception e)
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
}
}
