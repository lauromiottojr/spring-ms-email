package com.msemail.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.msemail.dtos.EmailDTO;
import com.msemail.models.EmailModel;
import com.msemail.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel> sendEmail(@RequestBody @Valid EmailDTO objDTO) {
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(objDTO, emailModel);
		emailService.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	}

}
