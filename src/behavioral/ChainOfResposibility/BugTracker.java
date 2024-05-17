package behavioral.ChainOfResposibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotify(Priority.ROUTINE);
        Notifier emailNotifier= new EmailNotifier(Priority.IMPORTANT);
        Notifier smSnotifier = new SMSnotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smSnotifier);

        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Everything is really bad", Priority.ASAP);
    }
}
