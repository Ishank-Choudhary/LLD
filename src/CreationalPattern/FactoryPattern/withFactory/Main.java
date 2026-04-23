package CreationalPattern.FactoryPattern.withFactory;


public class Main {
    public static void main(String[] args) {
        Transport transport = TransportFactory.createTransport("car"); // we can change type here
        transport.deliver();
    }
}
