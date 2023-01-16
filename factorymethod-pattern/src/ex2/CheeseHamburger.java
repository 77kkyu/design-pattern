package ex2;

public class CheeseHamburger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("CheeseHamburger - prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheeseHamburger - bake");
    }

    @Override
    public void box() {
        System.out.println("CheeseHamburger - box");
    }
}
