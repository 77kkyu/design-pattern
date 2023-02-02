package com.company.ex2;

public class Main {
	public static void main(String[] args) {
		CarFactory carFactory = new KoreaCarFactory();
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();

		CarFactory carFactory1 = new StateCarFactory();
		TireProduct tireProduct1 = carFactory.createTire();
		DoorProduct doorProduct1 = carFactory.createDoor();
	}
}
