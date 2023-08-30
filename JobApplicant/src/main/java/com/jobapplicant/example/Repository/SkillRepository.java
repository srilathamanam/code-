package com.jobapplicant.example.Repository;

import com.jobapplicant.example.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long >
{
}
