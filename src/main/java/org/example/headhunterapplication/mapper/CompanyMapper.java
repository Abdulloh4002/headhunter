package org.example.headhunterapplication.mapper;

import org.example.headhunterapplication.dto.CompanyDTO;
import org.example.headhunterapplication.entity.Company;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company> {
}
