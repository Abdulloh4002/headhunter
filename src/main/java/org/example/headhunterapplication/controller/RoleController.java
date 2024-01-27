package org.example.headhunterapplication.controller;


import lombok.Data;
import org.example.headhunterapplication.dto.RoleDTO;
import org.example.headhunterapplication.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("role")
public class RoleController {
    private final RoleService roleService;

    @GetMapping
    public List<RoleDTO> getRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public RoleDTO getRoleById(@PathVariable Integer id){
        return roleService.getRoleById(id);
    }

    @PostMapping
    public RoleDTO addRole(@RequestBody RoleDTO roleDTO){
        return roleService.addRole(roleDTO);
    }

    @PutMapping("/{id}")
    public RoleDTO updateRole(@RequestBody RoleDTO roleDTO, @PathVariable Integer id){

        return roleService.updateRole(roleDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteRole(@PathVariable Integer id){

        roleService.deleteRole(id);
        return "Selected role was deleted successfully";
    }
}
