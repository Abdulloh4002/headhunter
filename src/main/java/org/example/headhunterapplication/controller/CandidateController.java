package org.example.headhunterapplication.controller;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.headhunterapplication.dto.CandidateDTO;
import org.example.headhunterapplication.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("candidate")
public class CandidateController {
    private final CandidateService candidateService;

    @GetMapping
    public List<CandidateDTO> getCompanies(){
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{id}")
    public CandidateDTO getCandidateById(@PathVariable Integer id){
        return candidateService.getCandidateById(id);
    }

    @PostMapping
    public CandidateDTO addCandidate(@RequestBody CandidateDTO candidateDTO){
        return candidateService.addCandidate(candidateDTO);
    }

    @PutMapping("/{id}")
    public CandidateDTO updateCandidate(@RequestBody CandidateDTO candidateDTO, @PathVariable Integer id){

        return candidateService.updateCandidate(candidateDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteCandidate(@PathVariable Integer id){

        candidateService.deleteCandidate(id);
        return "Selected candidate was deleted successfully";
    }
}
