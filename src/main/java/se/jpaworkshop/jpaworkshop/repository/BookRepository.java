package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jpaworkshop.jpaworkshop.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
