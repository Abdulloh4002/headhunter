package org.example.headhunterapplication.dto;

import lombok.*;

import java.util.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private Integer id;
    private String name;
    private String description;
    private String longName;
    private String address;
    private Date date;
    private String website;
    private String email;
}

