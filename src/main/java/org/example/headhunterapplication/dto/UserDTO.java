package org.example.headhunterapplication.dto;

import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String password;
    private CandidateDTO candidateDTO;
    private Set<RoleDTO> roles;
    private Set<CompanyDTO> companies;

}

