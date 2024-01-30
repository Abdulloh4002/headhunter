package org.example.headhunterapplication.service;

import org.example.headhunterapplication.dto.CompanyDTO;

import java.util.List;

public interface CompanyService {
    CompanyDTO getCompanyById(Integer id);
    List<CompanyDTO> getAllCompanies();

    CompanyDTO addCompany(CompanyDTO companyDTO);
    CompanyDTO updateCompany(CompanyDTO companyDTO, Integer id);

    void deleteCompany(Integer id);

}
