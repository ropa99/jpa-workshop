package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.jpaworkshop.jpaworkshop.entity.AppUser;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {

    AppUser findByUsername(String username);
    List<AppUser> findByRegistrationDateBetween(LocalDate from, LocalDate to);
    List<AppUser> findByEmailIgnoreCase(String email);
    List<AppUser> findByIdIgnoreCase(int id); // Todo: check change argument to Details details

}
