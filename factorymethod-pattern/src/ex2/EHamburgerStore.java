package ex2;

public class EHamburgerStore extends HamburgerStore {
    @Override
    Hamburger createHamburger(String type) {
        if ("cheese".equals(type)) {
            return new CheeseHamburger();
        } else if ("pepperoni".equals(type)) {
            return new PepperoniHamburger();
        }
        return null;
    }
}
