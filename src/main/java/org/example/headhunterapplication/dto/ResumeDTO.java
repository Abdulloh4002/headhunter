package org.example.headhunterapplication.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ResumeDTO {
    private Integer id;
    private String title;
    private String description;
}
