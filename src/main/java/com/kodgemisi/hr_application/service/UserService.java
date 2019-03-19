package com.kodgemisi.hr_application.service;
import com.kodgemisi.hr_application.entity.User;
import com.kodgemisi.hr_application.model.UserDto;
import com.kodgemisi.hr_application.repository.UserRepository;
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

        final String name = userDto.getName();
        final String surname = userDto.getName();
        final String userName = userDto.getUserName();
        final String birthDay = userDto.getBirthDay();
        final String birtPlace = userDto.getBirthPlace();
        final String reference = userDto.getReference();
        final String habits = userDto.getHabits();
        final String gender = userDto.getGender();
        final String foreignLanguage = userDto.getForeignLanguage();
        final String solidering = userDto.getSoldiering();
        final String education = userDto.getEducation();
        final String lastJobs = userDto.getLastJobs();
        final String email = userDto.getEmail();

        return new User(name,surname,userName,birthDay,birtPlace,reference,habits,gender,foreignLanguage,solidering,education,lastJobs,email);
    }

    private UserDto getDtoFromUser(User user){

        final String name = user.getName();
        final String surname = user.getSurname();
        final String userName = user.getUserName();
        final String birthDay = user.getBirthDay();
        final String birtPlace = user.getBirthPlace();
        final String reference = user.getReference();
        final String habits = user.getHabits();
        final String gender = user.getGender();
        final String foreignLanguage = user.getForeignLanguage();
        final String solidering = user.getSoldiering();
        final String education = user.getEducation();
        final String lastJobs = user.getLastJobs();
        final String email = user.getEmail();
        // final LocalDate birthday = user.getBirthday();

        return new UserDto(name,surname,userName,birthDay,birtPlace,reference,habits,gender,foreignLanguage,solidering,education,lastJobs,email);
    }



}

