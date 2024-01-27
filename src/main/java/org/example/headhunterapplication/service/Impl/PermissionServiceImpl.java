package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.PermissionDTO;
import org.example.headhunterapplication.entity.Permission;
import org.example.headhunterapplication.mapper.PermissionMapper;
import org.example.headhunterapplication.repository.PermissionRepository;
import org.example.headhunterapplication.service.PermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class PermissionServiceImpl implements PermissionService {

    private final PermissionRepository repository;
    private final PermissionMapper mapper;

    @Override
    public PermissionDTO getPermissionById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<PermissionDTO> getAllPermissions() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public PermissionDTO addPermission(PermissionDTO permissionDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(permissionDTO)
                        )
                );
    }

    @Override
    public PermissionDTO updatePermission(PermissionDTO permissionDTO, Integer id) {

        Permission permission = repository.getReferenceById(id);

        permission.setName(permissionDTO.getName());

        return mapper
                .toDTO(repository
                        .save(permission)
                );
    }

    @Override
    public void deletePermission(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
