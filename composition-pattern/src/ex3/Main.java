package ex3;

public class Main {
	public static void main(String[] args){
		try{
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tempdir = new Directory("temp");
			Directory usrdir = new Directory("usr");

			rootdir.add(bindir);
			rootdir.add(tempdir);
			rootdir.add(usrdir);

			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));

			rootdir.printList();

			System.out.println("");
			System.out.println("Making user entries...");

			Directory yoon = new Directory("yoon");
			Directory lee = new Directory("lee");
			Directory mon = new Directory("mon");

			usrdir.add(yoon);
			usrdir.add(lee);
			usrdir.add(mon);

			yoon.add(new File("diary.html", 100));
			yoon.add(new File("Composite.java", 200));
			lee.add(new File("memo.tex", 300));
			mon.add(new File("game.doc", 400));
			mon.add(new File("junk.mail", 500));

			rootdir.printList();

		}catch(FileTreatmentException e){
			e.printStackTrace();
		}
	}
}
