package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.UserDTO;
import org.example.headhunterapplication.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, Users> {
}
