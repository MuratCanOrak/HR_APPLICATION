package com.kodgemisi.hr_application.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotEmpty
    private String isim;
    @NotEmpty
    private String soyisim;
    @NotNull
    private Integer yas;
    @NotNull
    private String email;

    // @DateTimeFormat(pattern = "yyyy-MM-dd")
    // private LocalDate birthday;


}

