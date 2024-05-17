package creational.singleton;

public class programLogger {
    private static programLogger programLogger;
    private static String logFile ="This is log file. \n\n";

    private programLogger() {
    }

    public static synchronized programLogger getProgramLogger() {
        if(programLogger == null) {
            programLogger = new programLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String info) {
        logFile+= info +"\n";
    }
    public void showLogFile() {
        System.out.println(logFile);
    }

}
