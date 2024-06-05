package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.jpaworkshop.jpaworkshop.entity.BookLoan;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface BookLoanRepository extends JpaRepository<BookLoan, Integer> {

    Optional<BookLoan> findBookLoanById(Integer id);
    Optional<BookLoan> findBookLoanByBorrowerId(Integer userId);
    Optional<BookLoan> findBookLoanByBookId(Integer bookId);
    Optional<BookLoan> findBookLoanByDueDateAndReturnedNot(LocalDate dueDate,Boolean isReturned);
    Optional<BookLoan> findBookLoanByLoanDateBetween(LocalDate from, LocalDate to);

    @Modifying
    @Query("update BookLoan bl set bl.returned = true where bl.id = :bokkLoanId")
    void updateBookLoanReturnStatusToTrue(@Param("bookLoanId") Integer id);
}
