package com.kodgemisi.hr_application.controller;

import com.kodgemisi.hr_application.model.UserDto;
import com.kodgemisi.hr_application.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String users(Model model){

        final Collection<UserDto> userDtos = userService.getAllUSers();

        model.addAttribute("userDto", new UserDto());
        model.addAttribute("userDtos", userDtos);

        return "user";
    }

    @PostMapping
    public String create(@ModelAttribute @Validated UserDto userDto, Model model){

        userService.create(userDto);
        model.addAttribute("userDto", new UserDto());
        return "user";
    }
}
