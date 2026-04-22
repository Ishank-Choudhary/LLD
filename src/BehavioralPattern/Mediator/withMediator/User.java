package BehavioralPattern.Mediator.withMediator;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void send(String msg){
        chatMediator.sendMessage(msg,this);
    }

    public void receive(String msg, User sender){
        System.out.println(name + " received: " + msg + " from " + sender.getName());
    }
}
