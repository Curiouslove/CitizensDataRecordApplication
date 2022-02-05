package com.snapnet.citizensdatarecord.service;

import com.snapnet.citizensdatarecord.citizenDto.request.CitizensInformation;
import com.snapnet.citizensdatarecord.citizenDto.request.LoginInfo;
import com.snapnet.citizensdatarecord.citizenDto.request.RegistrationInfo;
import com.snapnet.citizensdatarecord.citizenDto.response.Report;
import com.snapnet.citizensdatarecord.data.model.*;
import com.snapnet.citizensdatarecord.data.repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CitizenServiceImpl implements  CitizenService{

    @Autowired
    CitizensRepository citizensRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    StatesRepository statesRepository;

    @Autowired
    WardsRepository wardsRepository;

    @Autowired
    LGAsRepository lgAsRepository;

    @Override
    public void registerCitizen(RegistrationInfo registrationInfo, CitizensInformation citizenInfo){
        saveUser(registrationInfo);
        saveCitizen(registrationInfo, citizenInfo);
    }

    @Override
    public String login(Long id, LoginInfo loginInfo) {
        Optional<Users> user = usersRepository.findById(id);
        if(user.isPresent()){
            if(user.get().getEmail().equalsIgnoreCase(loginInfo.getEmail()) && user.get().getPassword().equalsIgnoreCase(loginInfo.getPassword())){
               return "Login Successful" ;
            }
        }
        return "Login Failed";

    }

    public void saveCitizen(RegistrationInfo registrationInfo, CitizensInformation citizenInfo){
        Citizens citizen = new Citizens();
        citizen.setName(registrationInfo.getName());
        citizen.setAddress(citizenInfo.getAddress());
        citizen.setPhoneNumber(citizenInfo.getPhoneNumber());
        if(citizenInfo.getGender().equalsIgnoreCase("female")){
            citizen.setGender(Gender.FEMALE);
        }else{
            citizen.setGender(Gender.MALE);
        }
         citizensRepository.save(citizen);
    }

    public void saveUser(RegistrationInfo registrationInfo)  {
        Users user = new Users();
        user.setName(registrationInfo.getName());
        user.setEmail(registrationInfo.getEmail());
        user.setPassword(registrationInfo.getPassword());
        usersRepository.save(user);
    }

    @Override
    public Report generateReport(){
        Report report = new Report();
        List<Citizens> citizensList;
        citizensList = citizensRepository.findAll();

        for(Citizens citizen: citizensList){
           Long wardId =  citizen.getWard().getId();
        }

        return report;
    }


}
