package com.example.naumenwebproject.controller;

import com.example.naumenwebproject.model.Person;
import com.example.naumenwebproject.service.RegistrationService;
import com.example.naumenwebproject.utill.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final PersonValidator personValidator;
    private final RegistrationService registrationService;
    @Autowired
    public AuthController(PersonValidator personValidator, RegistrationService registrationService) {
        this.personValidator = personValidator;
        this.registrationService = registrationService;
    }

    @GetMapping("/login")
    public String loginPage(){
        return "auth/login";
    }
    @GetMapping("/registration")
    public String registrationPage(@ModelAttribute("person") Person person){
        return "auth/registration";
    }
    @PostMapping("/registration")
    public String performRegistration(@ModelAttribute("person") @Valid Person person,
                                      BindingResult bindingResult){

        personValidator.validate(person,bindingResult);

        if (bindingResult.hasErrors()){
            return "redirect:/auth/registration";

        }
        registrationService.register(person);
        return "redirect:/auth/login";

    }
}