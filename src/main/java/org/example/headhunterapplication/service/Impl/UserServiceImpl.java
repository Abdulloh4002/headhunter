package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.UserDTO;
import org.example.headhunterapplication.entity.Users;
import org.example.headhunterapplication.mapper.UserMapper;
import org.example.headhunterapplication.repository.UserRepository;
import org.example.headhunterapplication.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDTO getUserById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(userDTO)
                        )
                );
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Integer id) {

        Users user = repository.getReferenceById(id);

        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());

        return mapper
                .toDTO(repository
                        .save(user)
                );
    }

    @Override
    public void deleteUser(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
