package com.springboot.book.controller;

import com.springboot.book.entity.Book;
import com.springboot.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Book>> getBookByUserId(@PathVariable String userId) {
		System.out.println("Here is the code: " + userId);
		List<Book> books = bookService.getBookByUserId(userId);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@GetMapping("/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable("bookId") Long id) {
		Book book = bookService.getBookById(id);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Book> saveBookDetails(@RequestBody Book book) {
		Book savedBook = bookService.saveBookDetails(book);
		return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
	}

	@GetMapping("/getAllBook")
	public ResponseEntity<List<Book>> getAllBook() {
		List<Book> bookList = bookService.getAllBook();
		return new ResponseEntity<>(bookList, HttpStatus.OK);
	}
}
