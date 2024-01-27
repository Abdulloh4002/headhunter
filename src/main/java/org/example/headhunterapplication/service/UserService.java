package org.example.headhunterapplication.service;

import org.example.headhunterapplication.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserById(Integer id);
    List<UserDTO> getAllUsers();

    UserDTO addUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO, Integer id);

    void deleteUser(Integer id);

}
