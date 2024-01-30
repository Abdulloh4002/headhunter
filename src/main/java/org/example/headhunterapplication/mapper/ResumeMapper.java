package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.ResumeDTO;
import org.example.headhunterapplication.entity.Resume;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResumeMapper extends EntityMapper<ResumeDTO, Resume>{
}
