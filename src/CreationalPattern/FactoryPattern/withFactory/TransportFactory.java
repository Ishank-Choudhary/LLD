package CreationalPattern.FactoryPattern.withFactory;

public class TransportFactory {
    public static  Transport createTransport(String type){
        return switch (type.toLowerCase()) {
            case ("car") -> new Car();
            case ("train") -> new Train();
            default -> throw new IllegalArgumentException("Unsuported transport type");
        };
    }
}
