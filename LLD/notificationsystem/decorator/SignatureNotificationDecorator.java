package notificationsystem.decorator;

public class SignatureNotificationDecorator extends INotificationDecorator {

    public SignatureNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        return notification.getContent() + " Singnature ";
    }
}
