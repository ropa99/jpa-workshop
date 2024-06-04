package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jpaworkshop.jpaworkshop.entity.BookLoan;

import java.time.LocalDate;
import java.util.Optional;

public interface BookLoanRepository extends JpaRepository<BookLoan, Integer> {

    Optional<BookLoan> findBookLoanById(Integer id);
    Optional<BookLoan> findBookLoanByBorrowerId(Integer userId);
    Optional<BookLoan> findBookLoanByBookId(Integer bookId);
    Optional<BookLoan> findBookLoanByDueDateAndReturnedNot(LocalDate dueDate,Boolean isReturned);
    Optional<BookLoan> findBookLoanByLoanDateBetween(LocalDate from, LocalDate to);
    BookLoan updateBookLoanById(Integer id, BookLoan bookLoan);
}
