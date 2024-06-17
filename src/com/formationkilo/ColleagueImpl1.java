package com.formationkilo;

public class ColleagueImpl1 extends Colleague{

	@Override
	public void sendMessage(Message m) {
		System.out.println("ColleagueImpl1 name"+name);
		System.out.println("Sending message toward "+m.getRecipient());
		m.setConsignor(this.name);
		mediator.transmitMessage(m);
		
	}

	@Override
	public void receiveMessage(Message m) {
		System.out.println("ColleagueImpl1 name"+name);
		System.out.println("receiving message "+m.getConsignor());
		System.out.println("Content: "+m.getContent());
		System.out.println("Consignor: "+m.getConsignor());

		mediator.transmitMessage(m);
		
	}

	public ColleagueImpl1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColleagueImpl1(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}

	public ColleagueImpl1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	

}
