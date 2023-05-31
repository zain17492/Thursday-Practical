package com.program.service;

import org.springframework.stereotype.Component;
import java.util.*;
import java.util.stream.Collectors;

import com.program.entity.Book;

@Component
public class BookService 
{
	private static List<Book> list= new ArrayList<>();
	
	static
	{
		list.add(new Book(101,"Tom Jones","Henr Fielding"));
		list.add(new Book(102,"A Passage to India","E.M Foster"));
		list.add(new Book(103,"A Revenue Stamp","Amrita Pritam"));
	}
	
	//to get all the books
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	//to get books by ID
		public Book getById(int id)
		{
			Book book=null;
			try {
				book=list.stream().filter(e-> e.getBid()==id).findFirst().get();
				return book;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return book;
			}
		}
		//to add a new book to the list
		public Book addBook(Book b)
		{
			list.add(b);
			return b;
		}

		//delete a book from the list based on ID
		public void deleteBook(int id) 
		{
			list=list.stream().filter(book->book.getBid()!=id).collect(Collectors.toList());
			
		}

		public void updateBook(Book book, int bookId) {
		list= list.stream().map(b->
			{
				if(b.getBid()==bookId)
				{
					b.setBname(book.getBname());
					b.setAuthor(book.getAuthor());
				}
				return b;
			}).collect(Collectors.toList());
			
		}
	}




	
	
	

	

