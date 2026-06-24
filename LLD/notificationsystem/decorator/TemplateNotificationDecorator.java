package notificationsystem.decorator;

public class TemplateNotificationDecorator extends INotificationDecorator {

    public TemplateNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        return notification.getContent() + " Template ";
    }

}
