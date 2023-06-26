package com.springboot.book.service;


import com.springboot.book.entity.Book;
import com.springboot.book.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public List<Book> getAllBook() {
        List<Book> bookList = new ArrayList<>();
        bookRepo.findAll().forEach(bookList::add);
        return bookList;
    }




    @Override
    public List<Book> getBookByUserId(String userId) {
        return bookRepo.findByUserId(userId);
    }

    @Override
    public Book saveBookDetails(Book book) {
        return bookRepo.save(book);
    }
}
