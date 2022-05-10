public class OnionRings extends ToppingDecorator {
    public OnionRings(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with " + "onion rings";
    }
}
