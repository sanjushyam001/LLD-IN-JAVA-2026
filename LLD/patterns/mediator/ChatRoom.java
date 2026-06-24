package LLD.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    List<User> users = new ArrayList<>();

    @Override
    public void send(String message, User sender) {

        for (User u : users) {

            if (u != sender) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.getName() + " User has been added ..");
        this.users.add(user);
    }

}
