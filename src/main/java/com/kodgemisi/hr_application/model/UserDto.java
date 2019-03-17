package com.kodgemisi.hr_application.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String userName;
    @NotEmpty
    private String birthDay;
    @NotEmpty
    private String birthPlace;
    @NotEmpty
    private String reference;
    @NotEmpty
    private String habits;
    @NotEmpty
    private String gender;
    @NotEmpty
    private String foreignLanguage;
    @NotEmpty
    private String soldiering;
    @NotEmpty
    private String education;
    @NotEmpty
    private String lastJobs;
    @NotEmpty
    private String email;

}

