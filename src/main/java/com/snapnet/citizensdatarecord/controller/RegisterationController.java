package com.snapnet.citizensdatarecord.controller;

import com.snapnet.citizensdatarecord.citizenDto.request.CitizensInformation;
import com.snapnet.citizensdatarecord.citizenDto.request.RegistrationInfo;
import com.snapnet.citizensdatarecord.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("registration/api/")
@Controller
public class RegisterationController {
    @Autowired
    CitizenService citizenService;

    @PostMapping("/")
    public ResponseEntity<?> registerCitizen(@RequestBody CitizensInformation citizenInfo, @RequestBody RegistrationInfo registrationInfo){
        citizenService.registerCitizen(registrationInfo,  citizenInfo);
        return new ResponseEntity<>("Successfully Registered", HttpStatus.OK);
    }
}
