package se.jpaworkshop.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.jpaworkshop.jpaworkshop.entity.AppUser;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    AppUser findByUsername(String username);
    List<AppUser> findByRegDateBetween(LocalDate from, LocalDate to);
    List<AppUser> findByUserDetails_Id(int id);
    List<AppUser> findByUserDetails_Email(String email); // Todo: check change argument to Details details

}
