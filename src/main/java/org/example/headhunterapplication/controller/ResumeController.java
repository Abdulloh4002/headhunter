package org.example.headhunterapplication.controller;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.headhunterapplication.dto.ResumeDTO;
import org.example.headhunterapplication.service.ResumeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("resume")
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping
    public List<ResumeDTO> getResumes(){
        return resumeService.getAllResumes();
    }

    @GetMapping("/{id}")
    public ResumeDTO getResumeById(@PathVariable Integer id){
        return resumeService.getResumeById(id);
    }

    @PostMapping
    public ResumeDTO addResume(@RequestBody ResumeDTO resumeDTO){
        return resumeService.addResume(resumeDTO);
    }

    @PutMapping("/{id}")
    public ResumeDTO updateResume(@RequestBody ResumeDTO resumeDTO, @PathVariable Integer id){

        return resumeService.updateResume(resumeDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteResume(@PathVariable Integer id){

        resumeService.deleteResume(id);
        return "Selected resume was deleted successfully";
    }
}
