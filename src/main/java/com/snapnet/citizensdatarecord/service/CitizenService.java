package com.snapnet.citizensdatarecord.service;

import com.snapnet.citizensdatarecord.citizenDto.request.CitizensInformation;
import com.snapnet.citizensdatarecord.citizenDto.request.LoginInfo;
import com.snapnet.citizensdatarecord.citizenDto.request.RegistrationInfo;
import com.snapnet.citizensdatarecord.citizenDto.response.Report;
import org.springframework.stereotype.Service;

@Service
public interface CitizenService {
    void registerCitizen(RegistrationInfo registrationInfo, CitizensInformation citizenInfo);
    String login(Long id, LoginInfo loginInfo);
    Report generateReport();
}
