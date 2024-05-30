package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.jpaworkshop.jpaworkshop.entity.Details;

import java.util.List;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {
//    List<Details> findAllById(Integer userId);
//    List<Details> findByEmailIgnoreCase(String emails);
//    List<Details> findDetailsByNameContains(String name );
//    List<Details> findDetailsByNameIgnoreCase(String name );
}
