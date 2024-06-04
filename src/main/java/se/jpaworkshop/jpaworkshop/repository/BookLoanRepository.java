package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jpaworkshop.jpaworkshop.entity.BookLoan;

public interface BookLoanRepository extends JpaRepository<BookLoan, Integer> {
}
