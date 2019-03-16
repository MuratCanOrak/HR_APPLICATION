package com.kodgemisi.hr_application.service;
import com.kodgemisi.hr_application.entity.User;
import com.kodgemisi.hr_application.model.UserDto;
import com.kodgemisi.hr_application.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create (UserDto userDto){

        final User user = getUserFromDto(userDto);

        userRepository.save(user);
    }

    public Collection<UserDto> getAllUSers(){

        final Iterable<User> users = userRepository.findAll();

        final List<UserDto> userDtos = new ArrayList<>();

        for (final User user :users){

            final UserDto userDto = getDtoFromUser(user);
            userDtos.add(userDto);
        }

        return  userDtos;
    }


    private User getUserFromDto(UserDto userDto){

        final String isim = userDto.getIsim();
        final String soyisim = userDto.getSoyisim();
        final Integer yas = userDto.getYas();
        final String email = userDto.getEmail();


        return new User(isim,soyisim,yas,email);
    }

    private UserDto getDtoFromUser(User user){

        final String isim = user.getIsim();
        final String soyisim = user.getSoyisim();
        final Integer yas = user.getYas();
        final String email = user.getEmail();
        // final LocalDate birthday = user.getBirthday();

        return new UserDto(isim,soyisim,yas,email);
    }



}

