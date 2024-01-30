package org.example.headhunterapplication.dto;

import lombok.*;

import java.util.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDTO {

    private Integer id;
    private ResumeDTO resumeDTO;
    private CompanyDTO companyDTO;
    private Date startDate;
    private Date endDate;
    private boolean present;
    private String position;
    private String description;
}

