package LLD.patterns.mediator;

public class BasicUser extends User {

    public BasicUser(ChatMediator mediator, String name) {
        super(mediator, name);

    }

    @Override
    public void send(String message) {

        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " Message has been received :: " + message);
    }

}
