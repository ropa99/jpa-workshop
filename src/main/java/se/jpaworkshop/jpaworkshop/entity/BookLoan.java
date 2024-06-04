package se.jpaworkshop.jpaworkshop.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import se.jpaworkshop.jpaworkshop.entity.AppUser;
import se.jpaworkshop.jpaworkshop.entity.Book;

@Entity
public class BookLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private LocalDate loanDate;
    @Column
    private LocalDate dueDate;
    @Column
    private boolean returned;

    @ManyToOne
    @JoinColumn(name="Appuser_id")
    private AppUser borrower;

    @ManyToOne()
    @JoinColumn(name="book_id")
    private Book book;

    public BookLoan(AppUser borrower, Book book) {
        this.loanDate = LocalDate.now();
        this.dueDate = LocalDate.now().plusDays(30);
        this.returned = false;
        this.borrower = borrower;
        this.book = book;
    }
    public BookLoan(){}

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public AppUser getBorrower() {
        return borrower;
    }

    public void setBorrower(AppUser borrower) {
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

