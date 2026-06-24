package LLD.patterns.mediator;

public class EmailMessageService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("EmailMessageService::send()");
    }

}
