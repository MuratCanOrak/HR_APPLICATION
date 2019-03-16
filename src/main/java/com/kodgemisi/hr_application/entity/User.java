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
    private String isim;
    private String soyisim;
    private Integer yas;
    private String email;



    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Adress> adresses;


    public User(String isim, String soyisim, Integer yas, String email) {

        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.email=email;
    }


}


