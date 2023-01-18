package ex2;

abstract class HamburgerStore {
    public Hamburger orderHambuger(String type) {
        Hamburger hamburger = createHamburger(type);
        hamburger.prepare();
        hamburger.bake();
        hamburger.box();
        return hamburger;
    }

    abstract Hamburger createHamburger(String type);
}
