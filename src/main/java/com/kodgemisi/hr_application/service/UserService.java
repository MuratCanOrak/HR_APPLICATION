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
        final String email = userDto.getEmail();
        final String adress = userDto.getAdress();
        final String phoneNumber = userDto.getPhoneNumber();
        final String thoughtsOnJob = userDto.getThoughtsOnJob();

        return new User(name,email,adress,phoneNumber,thoughtsOnJob);
    }

    private UserDto getDtoFromUser(User user){

        final String name = user.getName();
        final String email = user.getEmail();
        final String adress = user.getAdress();
        final String phoneNumber = user.getPhoneNumber();
        final String thoughtsOnJob = user.getThoughtsOnJob();

        return new UserDto(name,email,adress,phoneNumber,thoughtsOnJob);
    }



}

