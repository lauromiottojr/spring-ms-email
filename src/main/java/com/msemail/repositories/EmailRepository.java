package com.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
