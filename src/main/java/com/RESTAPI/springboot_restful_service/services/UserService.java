package com.RESTAPI.springboot_restful_service.services;

import com.RESTAPI.springboot_restful_service.dto.UserDto;
import com.RESTAPI.springboot_restful_service.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
