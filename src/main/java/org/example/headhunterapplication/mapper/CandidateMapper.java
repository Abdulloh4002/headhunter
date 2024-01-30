package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.CandidateDTO;
import org.example.headhunterapplication.entity.Candidate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CandidateMapper extends EntityMapper<CandidateDTO, Candidate>{
}
