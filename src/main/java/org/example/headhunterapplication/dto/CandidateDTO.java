package org.example.headhunterapplication.dto;

import lombok.*;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDTO {

    private Integer id;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private ResumeDTO resumeDTO;

}

