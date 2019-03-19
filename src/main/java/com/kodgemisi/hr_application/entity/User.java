package com.kodgemisi.hr_application.entity;

import lombok.*;
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
    private String email;
    private String adress;
    private String phoneNumber;
    private String thoughtsOnJob;

    public User(String name, String email,String adress,  String phoneNumber,  String thoughtsOnJob) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.thoughtsOnJob = thoughtsOnJob;

    }

}


