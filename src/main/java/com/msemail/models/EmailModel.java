package com.msemail.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.msemail.enums.StatusEmail;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
	private static final long serialVersionUID = 1L;

	// a senha da chave spring.mail.password= em app.prop deve ser gerada no google

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	private String subject;

	@Column(columnDefinition = "TEXT")
	private String text;
	private LocalDateTime sendDateEmail;
	private StatusEmail statusEmail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}

	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}

	public StatusEmail getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}

}
