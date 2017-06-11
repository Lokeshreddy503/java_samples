package org.lokesh.applabs.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.lokesh.applabs.messenger.service.MessageService;

@Path("/messages")
public class MessageResources 
{ 
	MessageService messageService = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    
	public List<org.lokesh.applabs.messenger.model.Messages> Messages()
	{
		return messageService.getMessages();
	}
    
    
}
