package LLD.patterns.mediator;

public class NotificationMediatorImpl implements NotificationMediator {

    private MessageService messageService;

    // public NotificationMediatorImpl(MessageService messageService) {
    // this.messageService = messageService;
    // }

    @Override
    public void notify(String type, String message) {

        if ("email".equals(type.toLowerCase())) {
            messageService = new EmailMessageService();
        } else if ("sms".equals(type.toLowerCase())) {
            messageService = new SMSMessageService();

        } else {
            System.out.println("Invalid Type");
        }
        messageService.send(message);
    }

}
