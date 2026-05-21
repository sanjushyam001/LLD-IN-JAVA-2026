package patterns.factory.factory2;

public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Message" + message + " has been sent by : SMSNotification");
    }

}