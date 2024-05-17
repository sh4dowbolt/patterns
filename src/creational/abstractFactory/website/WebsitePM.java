package creational.abstractFactory.website;

import creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website pm manages website project");
    }
}
