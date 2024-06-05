package se.jpaworkshop.jpaworkshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.jpaworkshop.jpaworkshop.entity.AppUser;
import se.jpaworkshop.jpaworkshop.entity.Details;
import se.jpaworkshop.jpaworkshop.repository.AppUserRepository;
import se.jpaworkshop.jpaworkshop.repository.DetailsRepository;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class _CommandLineRunner implements CommandLineRunner {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    DetailsRepository detailsRepository;


    @Override
    public void run(String... args) throws Exception {


        Details details1 = new Details("Person1","person1@gmail.com", LocalDate.now());
        //detailsRepository.save(details1);
        //AppUser appuser1 = new AppUser("Person1","Password",details1);
        //appUserRepository.save(appuser1);


//        Details details2 = new Details("Person2","person2@gmail.com", LocalDate.now());
//        AppUser appuser2 = new AppUser("Person2","Password",details2);
//        Details details3 = new Details("Person3","person3@gmail.com", LocalDate.now());
//        AppUser appuser3 = new AppUser("Person3","Password",details3);
//
//        detailsRepository.save(details1);
//        detailsRepository.save(details2);
//        detailsRepository.save(details3);
//        appUserRepository.save(appuser1);
//        appUserRepository.save(appuser2);
//        appUserRepository.save(appuser3);

      Optional<AppUser> found = appUserRepository.findById(2);
//        List<AppUser> found = appUserRepository.findByUsername("Person3");
        System.out.println(found);




    }
}
