package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.PermissionDTO;
import org.example.headhunterapplication.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {
}
