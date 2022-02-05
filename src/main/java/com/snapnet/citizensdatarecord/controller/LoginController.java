package com.snapnet.citizensdatarecord.controller;

import com.snapnet.citizensdatarecord.citizenDto.request.LoginInfo;
import com.snapnet.citizensdatarecord.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/")
@Controller
public class LoginController {
    @Autowired
    CitizenService citizenService;

    @PostMapping("/{id}")
    public ResponseEntity<?> login(@RequestBody LoginInfo loginInfo, @PathVariable Long id){
      String response = citizenService.login(id, loginInfo);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
