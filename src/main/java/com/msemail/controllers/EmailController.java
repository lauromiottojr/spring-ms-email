package com.msemail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.msemail.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

}
