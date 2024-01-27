package org.example.headhunterapplication.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {

    private Integer id;
    private String name;
    private String password;

}

