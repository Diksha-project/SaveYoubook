package com.springboot.book.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.book.entity.Book;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByUserId(String userId);


}

