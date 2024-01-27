package org.example.headhunterapplication.service;


import org.example.headhunterapplication.dto.PermissionDTO;

import java.util.List;

public interface PermissionService {
    PermissionDTO getPermissionById(Integer id);
    List<PermissionDTO> getAllPermissions();


    PermissionDTO addPermission(PermissionDTO permissionDTO);

    PermissionDTO updatePermission(PermissionDTO permissionDTO, Integer id);

    void deletePermission(Integer id);

}
