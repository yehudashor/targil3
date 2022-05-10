public class Chips extends ToppingDecorator {
    public Chips(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with " + "chips";
    }
}
