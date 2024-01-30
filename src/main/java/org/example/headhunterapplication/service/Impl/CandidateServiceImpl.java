package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.CandidateDTO;
import org.example.headhunterapplication.entity.Candidate;
import org.example.headhunterapplication.mapper.CandidateMapper;
import org.example.headhunterapplication.mapper.ResumeMapper;
import org.example.headhunterapplication.repository.CandidateRepository;
import org.example.headhunterapplication.service.CandidateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository repository;
    private final CandidateMapper mapper;
    private final ResumeMapper resumeMapper;


    @Override
    public CandidateDTO getCandidateById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<CandidateDTO> getAllCandidates() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public CandidateDTO addCandidate(CandidateDTO candidateDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(candidateDTO)
                        )
                );
    }

    @Override
    public CandidateDTO updateCandidate(CandidateDTO candidateDTO, Integer id) {


        Candidate candidate = repository.getReferenceById(id);
        candidate.setName(candidateDTO.getName());
        candidate.setAddress(candidateDTO.getAddress());
        candidate.setSurname(candidateDTO.getSurname());
        candidate.setPhoneNumber(candidateDTO.getPhoneNumber());
        candidate.setResume(resumeMapper.toEntity(candidateDTO.getResumeDTO()));


        return mapper
                .toDTO(repository
                        .save(candidate)
                );
    }

    @Override
    public void deleteCandidate(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
