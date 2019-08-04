package abstractFactory;


import abstractFactory.brands.impl.AudiProducts;
import abstractFactory.brands.IProducts;
import abstractFactory.brands.impl.MercedesProducts;

public class AbstractFactory {

    public static IProducts createFactory(String typeFactory) {

        IProducts res = null;

        switch (typeFactory) {

            case "mercedes": {
                res = new MercedesProducts();
                break;
            }
            case "audi": {
                res = new AudiProducts();
                break;
            }
            default:
                res = null;
        }
        return res;
    }
}
