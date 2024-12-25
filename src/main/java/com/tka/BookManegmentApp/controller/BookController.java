package com.tka.BookManegmentApp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.BookManegmentApp.Entity.Book;
import com.tka.BookManegmentApp.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService service;
	
	@PostMapping("addbook")
	public Book addbook(@RequestBody Book book) {
		return service.savebook(book);
	}
	@DeleteMapping("/deletebook")
	public void deletebook(@RequestBody Book book) {
		service.deletebook(book);
	}
	
	@PutMapping("/updatebook")
	public void updatebook(@RequestBody Book book) {
		service.updatebook(book);
	}
	@GetMapping("/getall")
	public List<Book> getall(){
		return service.getall();
	}
	@GetMapping("/findbyname/{b_name}")
	public Book getbyName(@PathVariable String b_name) {
	 return service.getByname(b_name);
	}
	
	@GetMapping("/findbyid/{id}")
	public Book getbyid(@PathVariable int id) {
		return service.getbookById(id);
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);	}
}
	


