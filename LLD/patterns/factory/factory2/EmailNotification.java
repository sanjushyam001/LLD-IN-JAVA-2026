package patterns.factory.factory2;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Message" + message + " has been sent by : EmailNotification");
    }

}
