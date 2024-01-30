package org.example.headhunterapplication.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private Resume resume;

    @OneToOne(cascade = CascadeType.ALL)
    private Company company;

    private Date startDate;
    private Date endDate;
    private boolean present;
    private String position;
    private String description;
}
