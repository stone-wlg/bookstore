package com.stone.bookstore.book.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<String> findAllBooks() {
        final List<String> books = new ArrayList<String>();
        books.add("hello");
        books.add("world");
        return books;
    }
}
