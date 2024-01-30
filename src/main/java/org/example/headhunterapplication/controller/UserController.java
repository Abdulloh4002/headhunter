package org.example.headhunterapplication.controller;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.headhunterapplication.dto.UserDTO;
import org.example.headhunterapplication.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@RequestBody UserDTO userDTO, @PathVariable Integer id){

        return userService.updateUser(userDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id){

        userService.deleteUser(id);
        return "Selected user was deleted successfully";
    }
}
