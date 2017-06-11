package org.lokesh.applabs.messenger.database;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;

import org.lokesh.applabs.messenger.model.Messages;
import org.lokesh.applabs.messenger.model.Profile;

public class DatabaseClass {

	
	public static Map<Long, Messages> message = new HashMap<>();
	public static Map<Long, Profile>  profile = new HashMap<>();
		
	public static Map<Long, Messages> getMessages()
	{
		return message;
	}
	public static Map<Long, Profile> getProfiles()
	{
		return profile;
	}
}
