package structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("sprint is active");
        activeSprint=true;
    }

    public void finishPrint() {
        System.out.println("sprint is not active");
        activeSprint = false;
    }
}
