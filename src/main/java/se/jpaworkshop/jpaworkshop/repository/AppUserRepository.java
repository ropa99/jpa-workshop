package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jpaworkshop.jpaworkshop.entity.AppUser;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findById(int id);
    List<AppUser> findByUsername(String username);
    List<AppUser> findByRegDateBetween(LocalDate from, LocalDate to);
    List<AppUser> findByDetails_Id(int id);
    List<AppUser> findByDetailsEmail(String email);

}