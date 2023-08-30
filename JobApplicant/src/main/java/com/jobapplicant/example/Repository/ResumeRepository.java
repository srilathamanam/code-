package com.jobapplicant.example.Repository;

import com.jobapplicant.example.Entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {
}
