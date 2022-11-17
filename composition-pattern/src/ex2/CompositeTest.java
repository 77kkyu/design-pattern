package ex2;

public class CompositeTest {
	public static void main(String[] args) {
		PersonalComputer pc = new PersonalComputer("PC");

		pc.add(new Processor(1000, "Intel"));
		pc.add(new Memory(500, "8GB"));
		pc.add(new HardDrive(800, "SSD"));

		System.out.println(pc.getName());
		System.out.println(pc.getPrice());
	}
}
