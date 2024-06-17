package com.formationkilo;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl1 extends Mediator{
    private List<Message>conversations=new ArrayList<>();
	@Override
	public void transmitMessage(Message m) {
		Colleague recepient=colleagues.get(m.getConsignor());
		System.out.println("-MediatorImpl1 ....");
		System.out.println("Transmitting of the message... ");
		System.out.println("From: "+m.getConsignor());
		System.out.println("Content: "+m.getContent());
		System.out.println("Towards: "+m.getRecipient());
		recepient.receiveMessage(m);
		conversations.add(m);
		
	}
	public void analyzeConversation() {
		for(Message m:conversations) {
			System.out.println(m.toString());
		}
	}

}
