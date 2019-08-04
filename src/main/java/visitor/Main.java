package visitor;

import visitor.buildings.House;
import visitor.buildings.Office;
import visitor.visitors.FireInspector;
import visitor.visitors.InsuranceBroker;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Office office = new Office();

        FireInspector fireInspector = new FireInspector();
        InsuranceBroker insuranceBroker = new InsuranceBroker();


        fireInspector.visit(house);
        fireInspector.visit(office);

        System.out.println("\n");

        insuranceBroker.visit(house);
        insuranceBroker.visit(office);
    }
}
