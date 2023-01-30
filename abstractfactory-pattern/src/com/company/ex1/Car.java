package com.company.ex1;

public class Car {
	private Frame frame;
	private Wheel wheel;

	public Car(Frame frame, Wheel wheel) {
		this.frame = frame;
		this.wheel = wheel;
	}

	public Frame getFrame() {
		return frame;
	}

	public Wheel getWheel() {
		return wheel;
	}
}
