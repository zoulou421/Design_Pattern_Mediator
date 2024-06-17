package com.formationkilo;

public class ColleagueImpl2 extends Colleague{

	@Override
	public void sendMessage(Message m) {
		System.out.println("ColleagueImpl2 name"+name);
		System.out.println("Sending message toward "+m.getRecipient());
		m.setConsignor(this.name);
		mediator.transmitMessage(m);
		
	}

	@Override
	public void receiveMessage(Message m) {
		System.out.println("ColleagueImpl2 name"+name);
		System.out.println("receiving message "+m.getConsignor());
		System.out.println("Content: "+m.getContent());
		System.out.println("Consignor: "+m.getConsignor());

		mediator.transmitMessage(m);
		
	}

	public ColleagueImpl2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColleagueImpl2(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}

	public ColleagueImpl2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
