
// Factory class.
public class HamburgerFactory {

    // Function for create different types of Hamburgers by code.
    public static Hamburger createHamburger(String code) {
        switch (code) {
            case "cl":
                return new ClassicHamburger();

            case "sp":
                return new SpicyHamburger();

            case "la":
                return new LambHamburger();

            case "hm":
                return new HomemadeHamburger();

            default:
                throw new RuntimeException("wrong Hamburger");
        }

    }
}

