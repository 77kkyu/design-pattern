package com.company.ex2;

public class StateCarFactory extends CarFactory {
	@Override
	public TireProduct createTire() {
		return new StateTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new StateDoorProduct();
	}
}
