package structural.compsite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project");
        for(Developer d: developers) {
            d.writeCode();
        }
    }


    @Override
    public void writeCode() {
       createProject();
    }
}
