package org.example.headhunterapplication.service.Impl;

import lombok.Data;
import org.example.headhunterapplication.dto.ExperienceDTO;
import org.example.headhunterapplication.entity.Experience;
import org.example.headhunterapplication.mapper.CompanyMapper;
import org.example.headhunterapplication.mapper.ExperienceMapper;
import org.example.headhunterapplication.mapper.ResumeMapper;
import org.example.headhunterapplication.repository.ExperienceRepository;
import org.example.headhunterapplication.service.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository repository;
    private final ExperienceMapper mapper;
    private final CompanyMapper companyMapper;
    private final ResumeMapper resumeMapper;

    @Override
    public ExperienceDTO getExperienceById(Integer id) {
        return mapper
                .toDTO(repository
                        .getReferenceById(id)
                );
    }

    @Override
    public List<ExperienceDTO> getAllExperiences() {
        return mapper
                .toDTO(repository
                        .findAll()
                );
    }

    @Override
    public ExperienceDTO addExperience(ExperienceDTO experienceDTO) {
        return mapper
                .toDTO(repository
                        .save(mapper
                                .toEntity(experienceDTO)
                        )
                );
    }

    @Override
    public ExperienceDTO updateExperience(ExperienceDTO experienceDTO, Integer id) {


        Experience experience = repository.getReferenceById(id);
        experience.setDescription(experience.getDescription());
        experience.setCompany(companyMapper.toEntity(experienceDTO.getCompanyDTO()));
        experience.setPosition(experience.getPosition());
        experience.setPresent(experienceDTO.isPresent());
        experience.setEndDate(experienceDTO.getEndDate());
        experience.setStartDate(experienceDTO.getStartDate());
        experience.setResume(resumeMapper.toEntity(experienceDTO.getResumeDTO()));

        return mapper
                .toDTO(repository
                        .save(experience)
                );
    }

    @Override
    public void deleteExperience(Integer id) {

        repository.delete(repository.getReferenceById(id));
    }
}
