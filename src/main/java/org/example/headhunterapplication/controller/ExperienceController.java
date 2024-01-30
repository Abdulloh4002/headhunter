package org.example.headhunterapplication.controller;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.headhunterapplication.dto.ExperienceDTO;
import org.example.headhunterapplication.service.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("experience")
public class ExperienceController {
    private final ExperienceService experienceService;

    @GetMapping
    public List<ExperienceDTO> getExperiences(){
        return experienceService.getAllExperiences();
    }

    @GetMapping("/{id}")
    public ExperienceDTO getExperienceById(@PathVariable Integer id){
        return experienceService.getExperienceById(id);
    }

    @PostMapping
    public ExperienceDTO addExperience(@RequestBody ExperienceDTO experienceDTO){
        return experienceService.addExperience(experienceDTO);
    }

    @PutMapping("/{id}")
    public ExperienceDTO updateExperience(@RequestBody ExperienceDTO experienceDTO, @PathVariable Integer id){

        return experienceService.updateExperience(experienceDTO, id);
    }

    @DeleteMapping("/{id}")
    public String deleteExperience(@PathVariable Integer id){

        experienceService.deleteExperience(id);
        return "Selected experience was deleted successfully";
    }
}
