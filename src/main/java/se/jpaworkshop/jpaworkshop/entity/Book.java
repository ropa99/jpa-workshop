package se.jpaworkshop.jpaworkshop.entity;

import jakarta.persistence.*;
import se.jpaworkshop.jpaworkshop.entity.Author;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private String title;
    @Column
    private int maxLoanDays;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    //private Set<BookLoan> bookLoans = new HashSet<>();
    private List<BookLoan> bookLoans = new ArrayList<>();

    @ManyToMany(mappedBy = "writtenBooks")
    private Set<Author> authors = new HashSet<>();

    public Book(String isbn, String title, int maxLoanDays) {
        this.isbn = isbn;
        this.title = title;
        this.maxLoanDays = maxLoanDays;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxLoanDays() {
        return maxLoanDays;
    }

    public void setMaxLoanDays(int maxLoanDays) {
        this.maxLoanDays = maxLoanDays;
    }
}
