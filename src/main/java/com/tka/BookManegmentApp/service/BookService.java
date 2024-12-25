package com.tka.BookManegmentApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.BookManegmentApp.Entity.Book;
import com.tka.BookManegmentApp.Repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository repository;
	
	public Book savebook(Book  book) {
		Book books = repository.save(book);
		return book;
		
	}
	public void deletebook(Book book) {
		repository.delete(book);
		
	}
    public void updatebook( Book book) {
		repository.save(book);
	}
    public List<Book> getall(){
     List<Book> book = repository.findAll();
     return book;

}
  public Book getByname(String b_name) {
	 return repository.findByname(b_name);

}
public Book getbookById( int id) {
	return repository.findById(id).orElse(null);
	
}
public void deleteById( int id) {
	repository.deleteById(id);
}

//}
}
