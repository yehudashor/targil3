public abstract class ToppingDecorator implements Hamburger {

    protected Hamburger hamburger;

    public ToppingDecorator(Hamburger _hamburger){
        hamburger = _hamburger;
    }
}
