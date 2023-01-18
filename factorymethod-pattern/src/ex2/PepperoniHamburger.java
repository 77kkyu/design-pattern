package ex2;

public class PepperoniHamburger implements Hamburger {
    @Override
    public void prepare() {
        System.out.println("PepperoniHamburger - prepare");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniHamburger - bake");
    }

    @Override
    public void box() {
        System.out.println("PepperoniHamburger - box");
    }
}
