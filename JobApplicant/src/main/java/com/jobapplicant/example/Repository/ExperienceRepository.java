package com.jobapplicant.example.Repository;

import com.jobapplicant.example.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
}
