package BehavioralPattern.Mediator.withMediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User u1 = new User("Ishank", chatRoom);
        User u2 = new User("Rahul", chatRoom);
        User u3 = new User("Aman", chatRoom);

        chatRoom.addUser(u1);
        chatRoom.addUser(u2);
        chatRoom.addUser(u3);

        u1.send("Hello everyone!");
    }
}
