package com.formationkilo;

public abstract class Colleague {
 protected Mediator mediator;
 protected String name;

public Colleague() {
}

public Colleague(String name, Mediator mediator) {
	this.mediator = mediator;
	this.name=name;
	mediator.addColleague(name, this);
}

public Colleague(String name) { 
    this.name=name;
}
 public abstract void sendMessage(Message m);
 public abstract void receiveMessage(Message m);

public Mediator getMediator() {
	return mediator;
}

public void setMediator(Mediator mediator) {
	this.mediator = mediator;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
 
}
