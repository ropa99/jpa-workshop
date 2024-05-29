package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jpaworkshop.jpaworkshop.entity.Details;

import java.util.List;

public interface DetailsRepository extends JpaRepository<Details, Integer> {
    List<Details> findAllByUserId(Integer userId);
    List<Details> findByEmailIgnoreCase(String emails);
    List<Details> findDetailsByNameContains(String name );
    List<Details> findDetailsByNameIgnoreCase(String name );
}
