package BehavioralPattern.Mediator.withoutMediator;

public class Main {
    public static void main(String[] args) {
        User rahul = new User("Rahul");
        User ravi = new User("Ravi");
        User ishank = new User("Ishank");
        User prince = new User("Prince");
        User varun = new User("Varun");

        // rahul is talking with each object individually, this is tight coupling
        rahul.sendMessage("Hello",ravi);
        rahul.sendMessage("Hi",prince);

        ishank.sendMessage("Lets go to gym",varun);
    }
}
