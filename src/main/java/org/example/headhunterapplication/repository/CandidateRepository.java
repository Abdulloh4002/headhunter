package org.example.headhunterapplication.repository;

import org.example.headhunterapplication.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
