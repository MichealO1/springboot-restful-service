package com.RESTAPI.springboot_restful_service.mapper;

import com.RESTAPI.springboot_restful_service.dto.UserDto;
import com.RESTAPI.springboot_restful_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
