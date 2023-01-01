package com.company.ex1;

public class LampOffCommand implements Command {
	private Lamp theLamp;

	public LampOffCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		theLamp.turnOff();
	}
}
