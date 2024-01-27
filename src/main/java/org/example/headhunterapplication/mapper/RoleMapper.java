package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.RoleDTO;
import org.example.headhunterapplication.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends EntityMapper<RoleDTO, Role>{
}
