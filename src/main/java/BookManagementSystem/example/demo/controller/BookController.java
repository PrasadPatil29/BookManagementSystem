package BookManagementSystem.example.demo.controller;

import BookManagementSystem.example.demo.entity.Book;
import BookManagementSystem.example.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;

    @PostMapping("book/add")
    public String addBook( @RequestBody Book book1){
        bookRepo.save(book1);
        return "book is add";

    }
    @GetMapping("/book/showbook")
    public List<Book> getAllBook() {
        List<Book> books = bookRepo.findAll();
        return books;
    }
    @DeleteMapping("book/deletebook/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deletebook( @PathVariable int id){
        Book book1 = bookRepo.findById(id).get();
        bookRepo.delete(book1);
        return "Book Delete";

    }











}




