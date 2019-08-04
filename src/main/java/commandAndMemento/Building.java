package commandAndMemento;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class Building implements IMemento {

    private List<String> materials = new ArrayList<>();

    public void addMaterial(String material) {
        materials.add(material);
    }

    public void countBricks() {
        System.out.println(materials.size());
    }

    @Override
    public void restore(CopyBuilding copyBuilding) {
        this.materials = copyBuilding.getMaterials();
    }

    public CopyBuilding getCopy() {
        return new CopyBuilding(materials);
    }

    @Getter
     public class CopyBuilding {

         private List<String> materials;
         long timeCreation;

        public CopyBuilding(List<String> materials) {
            this.materials = new ArrayList<>(materials);
            this.timeCreation = System.currentTimeMillis();
        }
    }
}
