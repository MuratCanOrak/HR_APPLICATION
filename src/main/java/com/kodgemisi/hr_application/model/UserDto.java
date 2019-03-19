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
    private String email;
    @NotEmpty
    private String adress;
    @NotEmpty
    private String phoneNumber;
    @NotEmpty
    private String thoughtsOnJob;




}

