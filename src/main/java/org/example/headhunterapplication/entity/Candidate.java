package org.example.headhunterapplication.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private Resume resume;


}
