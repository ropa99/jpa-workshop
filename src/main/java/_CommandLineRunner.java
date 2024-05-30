import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;
import se.jpaworkshop.jpaworkshop.entity.AppUser;
import se.jpaworkshop.jpaworkshop.entity.Details;
import se.jpaworkshop.jpaworkshop.repository.AppUserRepository;
import se.jpaworkshop.jpaworkshop.repository.DetailsRepository;

import java.time.LocalDate;


@Component
public class _CommandLineRunner implements CommandLineRunner {
    @Autowired
    AppUserRepository apr ;

    @Autowired
    DetailsRepository userDetails;


    @Override
    public void run(String... args) throws Exception {
        Details details = new Details("Kalle@gmail.com","Anka", LocalDate.now());
        userDetails.save(details);
        AppUser ap = new AppUser();
        //ap.setDetails(details);
        ap.setUsername("Kalle Anka");
        ap.setPassword("password");



        apr.save(ap);
        


        //AppUser ap = new AppUser("Anka","password",details);
        //ap.setUserDetails(details);
        //AppUser save = apr.save(ap);

        //AppUser save= apr.save(new AppUser("admin","secretkey",details));

        //AppUser ap= apr.save(new AppUser("Anka","secretkey"));


    }
}
