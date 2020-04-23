package com.api.library.Api;

import com.api.library.Entity.Book;
import com.api.library.Menager.BooksMenager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookApi {
    private BooksMenager booksMenager;

    @Autowired
    public BookApi(BooksMenager booksMenager) {
        this.booksMenager = booksMenager;
    }

    @GetMapping("/all")
    public Iterable<Book> getAllBooks()
    {
        return booksMenager.getAllBooks();
    }
    @GetMapping
    public Optional<Book> getBookById(@RequestParam int Id)
    {
       return booksMenager.getBookById(Id);
    }
    @PostMapping
    public Book addBook(@RequestBody Book book)
    {
        return booksMenager.addBook(book);
    }
    @PutMapping
    public Book updateBook(@RequestBody Book book)
    {
      return booksMenager.addBook(book);
    }
    @DeleteMapping
    public void deleteBook(@RequestParam Long Id)
    {
        booksMenager.deleteBookById(Id);
    }
}
