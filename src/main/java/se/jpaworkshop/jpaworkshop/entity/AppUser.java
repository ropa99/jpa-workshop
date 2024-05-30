package se.jpaworkshop.jpaworkshop.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;


@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode
@ToString
@Getter


@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    @Setter
    private String username;

    @Column(nullable = false, length = 50)
    @Setter
    private String password;

    @Column
    private LocalDate regDate;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="details_id")
    private Details details ;

    public AppUser(String username, String password,Details userDetails) {
        this.username = username;
        this.password = password;
        this.regDate = LocalDate.now();
        this.details = userDetails;

    }

    public AppUser(String username, String password) {
       this.username = username;
       this.password = password;
        this.regDate = LocalDate.now();
  }
}
