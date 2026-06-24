package LLD.patterns.mediator;

public class SMSMessageService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("SMSMessageService::send()");
    }

}
