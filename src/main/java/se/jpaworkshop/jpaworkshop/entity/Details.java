package se.jpaworkshop.jpaworkshop.entity;


import jakarta.persistence.*;
import java.time.LocalDate;
import se.jpaworkshop.jpaworkshop.entity.AppUser;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length=50)
    private String email;

    @Column
    private LocalDate birthDate;

    @OneToOne(mappedBy = "details")
    private AppUser appUser;


    public Details(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        //this.appUser = appUser;
    }
    public Details() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    //public int getId() {return this.id;}

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}