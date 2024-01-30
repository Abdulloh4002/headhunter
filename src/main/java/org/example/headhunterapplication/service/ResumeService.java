package org.example.headhunterapplication.service;

import org.example.headhunterapplication.dto.ResumeDTO;

import java.util.List;

public interface ResumeService {
    ResumeDTO getResumeById(Integer id);
    List<ResumeDTO> getAllResumes();

    ResumeDTO addResume(ResumeDTO roleDTO);
    ResumeDTO updateResume(ResumeDTO roleDTO, Integer id);

    void deleteResume(Integer id);

}
