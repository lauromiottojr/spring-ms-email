package com.msemail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msemail.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailRepository;

}
