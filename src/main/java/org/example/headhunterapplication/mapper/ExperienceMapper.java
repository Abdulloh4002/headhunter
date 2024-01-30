package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.CandidateDTO;
import org.example.headhunterapplication.dto.ExperienceDTO;
import org.example.headhunterapplication.entity.Candidate;
import org.example.headhunterapplication.entity.Experience;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExperienceMapper extends EntityMapper<ExperienceDTO, Experience>{
}
