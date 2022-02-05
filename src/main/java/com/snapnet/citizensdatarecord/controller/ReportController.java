package com.snapnet.citizensdatarecord.controller;

import com.snapnet.citizensdatarecord.citizenDto.response.Report;
import com.snapnet.citizensdatarecord.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/")
@Controller
public class ReportController {
    @Autowired
    CitizenService citizenService;

    @PostMapping("/")
    public ResponseEntity<?> generateReport(){
       Report report = citizenService.generateReport();
        return new ResponseEntity<>(report, HttpStatus.OK);
    }
}
