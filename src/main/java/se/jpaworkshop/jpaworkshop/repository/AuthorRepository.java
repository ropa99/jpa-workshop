package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.jpaworkshop.jpaworkshop.entity.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findByFirstName(String firstName);
    List<Author> findByLastName(String lastName);
    //List<Author> findByFirstNameOrLastNameContaining(String searchNam);
   // List<Author> findByBookId(Integer bookId);

}
