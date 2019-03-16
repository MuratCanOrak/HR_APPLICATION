package com.kodgemisi.hr_application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "/adress")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Adress {        // Entitylerde primitive kullanmıyoruz

    @Id
    @GeneratedValue
    private Integer id;

    private String city;

    private String street;


    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


}
