package org.example.headhunterapplication.service;

import org.example.headhunterapplication.dto.CandidateDTO;

import java.util.List;

public interface CandidateService {
    CandidateDTO getCandidateById(Integer id);
    List<CandidateDTO> getAllCandidates();

    CandidateDTO addCandidate(CandidateDTO roleDTO);
    CandidateDTO updateCandidate(CandidateDTO roleDTO, Integer id);

    void deleteCandidate(Integer id);

}
