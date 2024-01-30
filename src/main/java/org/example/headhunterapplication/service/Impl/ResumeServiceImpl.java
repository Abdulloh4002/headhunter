package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.ResumeDTO;
import org.example.headhunterapplication.entity.Resume;
import org.example.headhunterapplication.mapper.ResumeMapper;
import org.example.headhunterapplication.repository.ResumeRepository;
import org.example.headhunterapplication.service.ResumeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ResumeServiceImpl implements ResumeService {

    private final ResumeRepository repository;
    private final ResumeMapper mapper;


    @Override
    public ResumeDTO getResumeById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<ResumeDTO> getAllResumes() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public ResumeDTO addResume(ResumeDTO resumeDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(resumeDTO)
                        )
                );
    }

    @Override
    public ResumeDTO updateResume(ResumeDTO resumeDTO, Integer id) {


        Resume resume = repository.getReferenceById(id);
        resume.setTitle(resumeDTO.getTitle());
        resume.setDescription(resumeDTO.getDescription());
        return mapper
                .toDTO(repository
                        .save(resume)
                );
    }

    @Override
    public void deleteResume(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
