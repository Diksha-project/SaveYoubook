package com.springboot.book.service;

import com.springboot.book.entity.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);

    List<Book> getAllBook();
    

    List<Book> getBookByUserId(String userId);

    Book saveBookDetails(Book book);
}
