package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.RoleDTO;
import org.example.headhunterapplication.entity.Permission;
import org.example.headhunterapplication.entity.Role;
import org.example.headhunterapplication.mapper.RoleMapper;
import org.example.headhunterapplication.repository.RoleRepository;
import org.example.headhunterapplication.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;
    private final RoleMapper mapper;

    @Override
    public RoleDTO getRoleById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<RoleDTO> getAllRoles() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public RoleDTO addRole(RoleDTO roleDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(roleDTO)
                        )
                );
    }

    @Override
    public RoleDTO updateRole(RoleDTO roleDTO, Integer id) {

        Role role = repository.getReferenceById(id);

        role.setName(roleDTO.getName());
        role.setPermissions(roleDTO.getPermissions()
                .stream()
                .map(permissionDTO -> Permission.builder()
                        .id(permissionDTO.getId())
                        .name(permissionDTO.getName())
                        .build())
                .collect(Collectors.toSet())
        );

        return mapper
                .toDTO(repository
                        .save(role)
                );
    }

    @Override
    public void deleteRole(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
