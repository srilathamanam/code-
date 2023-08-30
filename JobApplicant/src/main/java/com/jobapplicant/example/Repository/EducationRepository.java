package com.jobapplicant.example.Repository;

import com.jobapplicant.example.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education,Long>
{
}
