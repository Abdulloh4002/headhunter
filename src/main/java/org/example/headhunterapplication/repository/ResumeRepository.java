package org.example.headhunterapplication.repository;

import org.example.headhunterapplication.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResumeRepository extends JpaRepository<Resume, Integer> {
}
