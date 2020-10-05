package com.krupa.joshi.registration.RegistrationForm.service;

import com.krupa.joshi.registration.RegistrationForm.model.RegistrationForm;
import com.krupa.joshi.registration.RegistrationForm.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    private RegisterRepository regRepository;

    @Autowired
    public RegistrationService(RegisterRepository regRepository) {
        this.regRepository = regRepository;
    }

    public void saveUser(RegistrationForm user) {
         regRepository.save(user);
    }

    public List<RegistrationForm> findAllByOrderByReg_dateDesc(){
        return regRepository.findAllByOrderByReg_dateDesc();
    }
}
