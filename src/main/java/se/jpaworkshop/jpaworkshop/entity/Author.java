package se.jpaworkshop.jpaworkshop.entity;

import jakarta.persistence.*;
import se.jpaworkshop.jpaworkshop.entity.Book;
import java.util.Set;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @ManyToMany
    @JoinTable(name = "author_book",
                    joinColumns = @JoinColumn(name = "author_id"),
                    inverseJoinColumns = @JoinColumn(name = "book_id"))


    private Set<Book> writtenBooks;

    public Author(String firstName, String lastName, Set<Book> writtenBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.writtenBooks = writtenBooks;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(Set<Book> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }
}
