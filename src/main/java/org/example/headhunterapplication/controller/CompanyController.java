package org.example.headhunterapplication.controller;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.headhunterapplication.dto.CompanyDTO;
import org.example.headhunterapplication.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("company")
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping
    public List<CompanyDTO> getCompanies(){
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public CompanyDTO getCompanyById(@PathVariable Integer id){
        return companyService.getCompanyById(id);
    }

    @PostMapping
    public CompanyDTO addCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.addCompany(companyDTO);
    }

    @PutMapping("/{id}")
    public CompanyDTO updateCompany(@RequestBody CompanyDTO companyDTO, @PathVariable Integer id){

        return companyService.updateCompany(companyDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteCompany(@PathVariable Integer id){

        companyService.deleteCompany(id);
        return "Selected company was deleted successfully";
    }
}
