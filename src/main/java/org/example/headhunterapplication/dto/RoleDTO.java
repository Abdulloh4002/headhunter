package org.example.headhunterapplication.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class RoleDTO {

    private Integer id;
    private String name;
    private Set<PermissionDTO> permissions;

}
