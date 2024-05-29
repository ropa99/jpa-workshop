import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.jpaworkshop.jpaworkshop.entity.AppUser;
import se.jpaworkshop.jpaworkshop.entity.Details;
import se.jpaworkshop.jpaworkshop.repository.AppUserRepository;


@Component
public class _CommandLineRunner implements CommandLineRunner {
    @Autowired
    AppUserRepository apr ;
    @Autowired
    Details details;

    @Override
    public void run(String... args) throws Exception {
        //Details details = new Details("Kalle@gmail.com","Anka", LocalDate.now());
        apr.save(new AppUser("admin","secretkey"));

    }
}
