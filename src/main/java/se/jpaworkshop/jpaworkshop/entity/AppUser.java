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

    @Setter
    @OneToOne
    @JoinColumn(name ="id")
    private Details userDetails ;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.regDate = LocalDate.now();



    }
}
