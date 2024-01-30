package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.CompanyDTO;
import org.example.headhunterapplication.dto.RoleDTO;
import org.example.headhunterapplication.entity.Company;
import org.example.headhunterapplication.entity.Role;
import org.example.headhunterapplication.mapper.CompanyMapper;
import org.example.headhunterapplication.mapper.RoleMapper;
import org.example.headhunterapplication.repository.CompanyRepository;
import org.example.headhunterapplication.repository.RoleRepository;
import org.example.headhunterapplication.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;
    private final CompanyMapper mapper;


    @Override
    public CompanyDTO getCompanyById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<CompanyDTO> getAllCompanies() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public CompanyDTO addCompany(CompanyDTO companyDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(companyDTO)
                        )
                );
    }

    @Override
    public CompanyDTO updateCompany(CompanyDTO companyDTO, Integer id) {


        Company company = repository.getReferenceById(id);
        company.setName(companyDTO.getName());
        company.setDate(companyDTO.getDate());
        company.setAddress(companyDTO.getAddress());
        company.setEmail(companyDTO.getEmail());
        company.setDescription(companyDTO.getDescription());
        company.setWebsite(companyDTO.getWebsite());
        company.setLongName(companyDTO.getLongName());


        return mapper
                .toDTO(repository
                        .save(company)
                );
    }

    @Override
    public void deleteCompany(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
