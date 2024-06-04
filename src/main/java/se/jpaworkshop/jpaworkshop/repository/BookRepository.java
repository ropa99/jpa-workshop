package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.jpaworkshop.jpaworkshop.entity.Book;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalInt;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Optional<Book> findById(int id);
    Book findByIsbnIgnoreCase(String isbn);
    Optional<Book> findByTitleContaining(String title);
    Optional<Book> findByMaxLoanDaysBefore(int days);
    Optional<Book> findByBookLoansIsTrue();
    //Optional<Book> findByBookLoansAfter();
}
