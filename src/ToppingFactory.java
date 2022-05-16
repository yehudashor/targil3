
// class that extends from ToppingAbstractFactory.
public class ToppingFactory extends ToppingAbstractFactory{

    // Function for create different types of Toppings by code
    // also she gets a hamburger interface for add Toppings.
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
