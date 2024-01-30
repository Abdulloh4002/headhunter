package org.example.headhunterapplication.service;

import org.example.headhunterapplication.dto.ExperienceDTO;

import java.util.List;

public interface ExperienceService {
    ExperienceDTO getExperienceById(Integer id);
    List<ExperienceDTO> getAllExperiences();

    ExperienceDTO addExperience(ExperienceDTO experienceDTO);
    ExperienceDTO updateExperience(ExperienceDTO experienceDTO, Integer id);

    void deleteExperience(Integer id);

}
