package patterns.factory.factory2;

public class Main {

    public static void main(String[] args) {
        NotificationService service = new EmailNotificationService();
        service.notifyUser("Hello friends!!");
    }
}
