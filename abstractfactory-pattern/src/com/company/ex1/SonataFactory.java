package com.company.ex1;

public class SonataFactory implements CarFactory {
	@Override
	public Frame createFrame() {
		return new SonataFrame();
	}

	@Override
	public Wheel createWheel() {
		return new SonataWheel();
	}
}
