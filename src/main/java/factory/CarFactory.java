package factory;




public class CarFactory {

    public static ICar getCar(String car) {

        ICar res;
        switch (car) {
            case "mercedes": {
                res = () -> System.out.println("drive mercedes");
                break;
            }
            case "audi": {
                res = () -> System.out.println("drive audi");
                break;
            }
            default:
                res = () -> System.out.println("drive nothing");
        }
        return res;
    }
}
