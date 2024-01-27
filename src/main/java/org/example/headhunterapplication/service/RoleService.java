package org.example.headhunterapplication.service;

import org.example.headhunterapplication.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    RoleDTO getRoleById(Integer id);
    List<RoleDTO> getAllRoles();

    RoleDTO addRole(RoleDTO userDTO);
    RoleDTO updateRole(RoleDTO userDTO, Integer id);

    void deleteRole(Integer id);

}
