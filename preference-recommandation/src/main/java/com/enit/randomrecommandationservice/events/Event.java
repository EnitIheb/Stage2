package com.enit.randomrecommandationservice.events;

public class Event {

	private EventName type;
	public Event(EventName type) {
		super();
		this.type = type;
	}

	public EventName getType() {
		return type;
	}

	public void setType(EventName type) {
		this.type = type;
	}

	public Event() {


	}


}
