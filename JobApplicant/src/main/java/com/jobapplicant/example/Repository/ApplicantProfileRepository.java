package com.jobapplicant.example.Repository;

import com.jobapplicant.example.Entity.ApplicantProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantProfileRepository extends JpaRepository<ApplicantProfile, Long> {
}
