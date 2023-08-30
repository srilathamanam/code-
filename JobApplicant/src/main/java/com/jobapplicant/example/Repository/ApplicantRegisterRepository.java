package com.jobapplicant.example.Repository;

import com.jobapplicant.example.Entity.ApplicantRegisterwithOTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicantRegisterRepository extends JpaRepository<ApplicantRegisterwithOTP, Integer> {
    Optional<ApplicantRegisterwithOTP> findByEmail(String email);

}
