package com.jobapplicant.example.Controller;

import com.jobapplicant.example.Entity.ApplicantProfile;
import com.jobapplicant.example.Service.ApplicantProfileService;
import com.jobapplicant.example.Service.ApplicantRegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ApplicantProfileController {
    @Autowired
    private ApplicantRegisterService applicantRegisterService;
    @Autowired
    private ApplicantProfileService applicantProfileService;



    @PostMapping("/update")
    public ResponseEntity<String> registerJobSeeker(@Valid @RequestBody ApplicantProfile applicantProfile) {
        applicantProfileService.registerJobSeeker(applicantProfile);
        return ResponseEntity.ok("Job seeker registered successfully.");
    }
    @GetMapping("/all")
    public List<ApplicantProfile> getAllJobSeekers()
    {
        return applicantProfileService.getAllApplicants();
    }
}
