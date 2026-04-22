package BehavioralPattern.Mediator.withMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for(User user: users) {
            if (user != sender) {
                user.receive(msg, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
