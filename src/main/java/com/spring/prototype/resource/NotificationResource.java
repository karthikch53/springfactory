package com.spring.prototype.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.prototype.factory.NotificationFactory;

@Component
@Path("/notification")
@Produces(MediaType.TEXT_PLAIN)
public class NotificationResource {
	
	@Autowired
	NotificationFactory factory;
	
	@POST
	@Path("{type}")
	public String sendNotification(@PathParam("type") String type)
	{
		return factory.getNotificationService(type).sendNotification();
	}

}
