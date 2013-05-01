package com.spring.prototype.factory;

import com.spring.prototype.service.NotificationService;

public interface NotificationFactory {
	
	NotificationService getNotificationService(String notificationType);

}
