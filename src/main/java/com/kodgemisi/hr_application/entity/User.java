package com.kodgemisi.hr_application.entity;


import lombok.*;
import java.util.List;
import javax.persistence.*;


@Entity(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;
    private String userName;
    private String birthDay;
    private String birthPlace;
    private String reference;
    private String habits;
    private String gender;
    private String foreignLanguage;
    private String soldiering;
    private String education;
    private String lastJobs;
    private String email;



    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Adress> adresses;

    public User(String name, String surname, String userName, String birthDay, String birthPlace, String reference, String habits,String gender, String foreignLanguage, String soldiering, String education, String lastJobs, String email) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.reference = reference;
        this.habits = habits;
        this.gender=gender;
        this.foreignLanguage = foreignLanguage;
        this.soldiering = soldiering;
        this.education = education;
        this.lastJobs = lastJobs;
        this.email = email;
    }

}


