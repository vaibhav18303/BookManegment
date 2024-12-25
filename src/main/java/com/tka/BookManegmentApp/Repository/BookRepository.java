package com.tka.BookManegmentApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.BookManegmentApp.Entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book findByname(String b_name);


}
