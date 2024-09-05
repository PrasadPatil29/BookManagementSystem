package BookManagementSystem.example.demo.repository;

import BookManagementSystem.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
