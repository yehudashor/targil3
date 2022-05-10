import groovy.lang.GString;

public class ToppingFactory extends ToppingAbstractFactory{
    @Override
    public Hamburger getTopping(String code, Hamburger hamburger) {
        switch (code) {
            case "ch":
                return new Chips(hamburger);

            case "or":
                return new OnionRings(hamburger);

            case "sa":
                return new Salad(hamburger);

            case "fe":
                return new FriedEgg(hamburger);

            default:
                throw new RuntimeException("wrong Topping");
        }
    }
}
