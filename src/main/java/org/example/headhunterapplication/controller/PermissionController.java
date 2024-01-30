package org.example.headhunterapplication.controller;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.headhunterapplication.dto.PermissionDTO;
import org.example.headhunterapplication.dto.RoleDTO;
import org.example.headhunterapplication.service.PermissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("permission")
public class PermissionController {
    private final PermissionService permissionService;

    @GetMapping
    public List<PermissionDTO> getPermissions(){
        return permissionService.getAllPermissions();
    }


    @GetMapping("/{id}")
    public PermissionDTO getPermissionById(@PathVariable Integer id){
        return permissionService.getPermissionById(id);
    }

    @PostMapping
    public PermissionDTO addPermission(@RequestBody PermissionDTO permissionDTO){
        return permissionService.addPermission(permissionDTO);
    }

    @PutMapping("/{id}")
    public PermissionDTO updatePermission(@RequestBody PermissionDTO permissionDTO, @PathVariable Integer id){

        return permissionService.updatePermission(permissionDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deletePermission(@PathVariable Integer id){

        permissionService.deletePermission(id);
        return "Selected permission was deleted successfully";
    }
}
