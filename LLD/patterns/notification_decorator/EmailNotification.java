package patterns.notification_decorator;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Message send by \n = > Email ");
    }

}
