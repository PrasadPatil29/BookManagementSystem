package BookManagementSystem.example.demo.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="BookManagementSystem")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name="BookId")
    private int bookid;
    @Column (name="BookName")
    private String bookname;
    private String author;
    private float price;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
