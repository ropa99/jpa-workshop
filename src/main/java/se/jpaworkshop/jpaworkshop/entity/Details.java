package se.jpaworkshop.jpaworkshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length=50)

    private String email;

    @Column(nullable = false, length = 100)

    private String name;

    @Column

    private LocalDate birthDate;

    @OneToOne(mappedBy = "details")
    private AppUser appUser;

    public Details(String email, String name, LocalDate birthDate) {
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }
}
