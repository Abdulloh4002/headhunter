package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.UserDTO;
import org.example.headhunterapplication.entity.Company;
import org.example.headhunterapplication.entity.Permission;
import org.example.headhunterapplication.entity.Role;
import org.example.headhunterapplication.entity.Users;
import org.example.headhunterapplication.mapper.CandidateMapper;
import org.example.headhunterapplication.mapper.UserMapper;
import org.example.headhunterapplication.repository.UserRepository;
import org.example.headhunterapplication.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    private final CandidateMapper candidateMapper;

    @Override
    public UserDTO getUserById(Integer id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return mapper.toDTO(repository.findAll());
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        return mapper.toDTO(repository.save(mapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Integer id) {

        Users user = repository.getReferenceById(id);

        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setCompanies(userDTO.getCompanies().stream().map(CompanyDTO -> Company.builder().id(CompanyDTO.getId()).name(CompanyDTO.getName()).date(CompanyDTO.getDate()).address(CompanyDTO.getAddress()).email(CompanyDTO.getEmail()).description(CompanyDTO.getDescription()).website(CompanyDTO.getWebsite()).longName(CompanyDTO.getLongName()).build()).collect(Collectors.toSet()));
        user.setCandidate(candidateMapper.toEntity(userDTO.getCandidateDTO()));
        user.setRoles(userDTO.getRoles().stream().map(roleDTO -> Role.builder().id(roleDTO.getId()).name(roleDTO.getName()).permissions(roleDTO.getPermissions().stream().map(permissionDTO -> Permission.builder().id(permissionDTO.getId()).name(permissionDTO.getName()).build()).collect(Collectors.toSet())).build()).collect(Collectors.toSet()));

        return mapper.toDTO(repository.save(user));
    }

    @Override
    public void deleteUser(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
