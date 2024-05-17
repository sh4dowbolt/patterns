package behavioral.ChainOfResposibility;

public class SMSnotifier extends Notifier{
    public SMSnotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("sendind sms to manager "+message);

    }
}
