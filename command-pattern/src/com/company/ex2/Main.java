package com.company.ex2;

public class Main {
	public static void main(String[] args) {
		MinusCalculator minusCalculator = new MinusCalculator();
		AddCalculator addCalculator = new AddCalculator();

		People people = new People();
		people.addCommend(minusCalculator);
		people.addCommend(addCalculator);

		double result1 = people.execute(0, 1, 2);
		double result2 = people.execute(1, 1, 2);

		System.out.println(result1);
		System.out.println(result2);
	}
}
