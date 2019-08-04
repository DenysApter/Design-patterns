package templateMethod;

import templateMethod.buildings.CustomBuilding;
import templateMethod.buildings.SimpleBuilding;

public class Main {
    public static void main(String[] args) {
        SimpleBuilding simpleBuilding = new SimpleBuilding();
        CustomBuilding customBuilding = new CustomBuilding();

        simpleBuilding.build();
        System.out.println("\n");
        customBuilding.build();
    }
}
