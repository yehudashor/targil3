public class Salad extends ToppingDecorator {
    public Salad(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with " + "salad";
    }
}
