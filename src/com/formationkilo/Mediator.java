package com.formationkilo;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
	protected Map<String,Colleague>colleagues
	=new HashMap<String,Colleague>();
	
	public void addColleague(String ref,Colleague c) {
		colleagues.put(ref, c);
	}
	public abstract void transmitMessage(Message m);

}
