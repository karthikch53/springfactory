package com.spring.prototype.service;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationService implements NotificationService {

	public String sendNotification() {
		return "Send notifications via email";
	}

}
