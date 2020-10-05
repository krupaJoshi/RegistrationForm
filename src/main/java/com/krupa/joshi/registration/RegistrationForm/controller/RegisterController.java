package com.krupa.joshi.registration.RegistrationForm.controller;

import com.krupa.joshi.registration.RegistrationForm.model.RegistrationForm;
import com.krupa.joshi.registration.RegistrationForm.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private RegistrationService regService;

    @GetMapping(name = "homepage", path = "/home")
    public String homePage(@ModelAttribute("command") RegistrationForm regForm,
                           ModelMap model) {
        regForm = new RegistrationForm();
        model.addAttribute("register", regForm);
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("command") @Valid RegistrationForm regForm, BindingResult result) {
        if(result.hasErrors()){
            return "register";
        }
    regService.saveUser(regForm);

    return "confirmation";
}

    @GetMapping(name = "userReport", path = "/report")
    public String getUserReport(@ModelAttribute("command") RegistrationForm regForm,
                                ModelMap model) {
        List<RegistrationForm> userReport = regService.findAllByOrderByReg_dateDesc();
        model.addAttribute("userReport", userReport);

        return "userReport";
    }

}

