package com.gti.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.gti.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}