package com.RESTAPI.springboot_restful_service.mapper;

import com.RESTAPI.springboot_restful_service.dto.UserDto;
import com.RESTAPI.springboot_restful_service.entity.User;

public class UserMapper {
    //Convert User JPA Entity into UserDTO
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    //Convert userDto into User JPA Entity
    public  static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
