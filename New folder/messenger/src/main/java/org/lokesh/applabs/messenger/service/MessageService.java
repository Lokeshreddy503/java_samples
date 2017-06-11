package org.lokesh.applabs.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.lokesh.applabs.messenger.database.DatabaseClass;
import org.lokesh.applabs.messenger.model.Messages;

public class MessageService {
private Map<Long,Messages> messages = DatabaseClass.getMessages();
public List<Messages> getMessages()
{
	/*Messages messages = new Messages(111,"Hello LOkesh","Lokesh");
	Messages messages2 = new Messages(222,"Hello Raju","Raju");
	List<Messages> list = new ArrayList<Messages>();
	list.add(messages);
	list.add(messages2);
	return list;*/
	return new ArrayList<Messages>(messages.values());
}

}
