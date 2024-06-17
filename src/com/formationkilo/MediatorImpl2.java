package com.formationkilo;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl2 extends Mediator{
	@Override
	public void transmitMessage(Message m) {
		Colleague recepient=colleagues.get(m.getConsignor());
		System.out.println("-MediatorImpl2 ....");
		System.out.println("Transmitting of the message... ");
		System.out.println("From: "+m.getConsignor());
		System.out.println("Content: "+m.getContent());
		System.out.println("Towards: "+m.getRecipient());
		recepient.receiveMessage(m);
		
	}
	

}
