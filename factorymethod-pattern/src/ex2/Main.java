package ex2;

public class Main {
    public static void main(String[] args) {
        HamburgerStore store1 = new EHamburgerStore();
        HamburgerStore store2 = new THamburgerStore();

        Hamburger hamburger1 = store1.orderHambuger("cheese");
        Hamburger hamburger2 = store2.orderHambuger("pepperoni");
    }
}
