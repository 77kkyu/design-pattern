package com.company.ex1;

public class AvanteFactory implements CarFactory {
	@Override
	public Frame createFrame() {
		return new AvanteFrame();
	}

	@Override
	public Wheel createWheel() {
		return new AvanteWheel();
	}
}
