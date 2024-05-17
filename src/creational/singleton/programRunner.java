package creational.singleton;

public class programRunner {
    public static void main(String[] args) {

        programLogger.getProgramLogger().addLogInfo("first log...");
        programLogger.getProgramLogger().addLogInfo("2 log...");
        programLogger.getProgramLogger().addLogInfo("3 log...");
        programLogger.getProgramLogger().addLogInfo("4 log...");
        programLogger.getProgramLogger().showLogFile();
    }
}
