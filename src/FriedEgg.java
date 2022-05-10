public class FriedEgg extends ToppingDecorator {

    public FriedEgg(Hamburger hamburger){
        super(hamburger);
    }
    @Override
    public String serve() {
        return hamburger.serve() + " with " + "fried egg";

    }
}
