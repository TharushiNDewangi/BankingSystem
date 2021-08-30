package com.example.bankingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.bankingsystem.dto.UserRegistrationDto;
import com.example.bankingsystem.service.Userservice;

@Controller

public class UserRegistration {

	private Userservice userService;

	public UserRegistration(Userservice userService) {
		super();
		this.userService = userService;
	}
	@RequestMapping("/registration")
	public ModelAndView getpage() {
		return new ModelAndView("registration.html");
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}
