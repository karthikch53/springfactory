package com.spring.prototype.service;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotificationService implements NotificationService {

	public String sendNotification()
	{
		return "Send notifications via sms";
	}

}
