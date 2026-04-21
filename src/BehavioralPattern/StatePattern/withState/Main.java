package BehavioralPattern.StatePattern.withState;

public class Main {
    public static void main(String[] args) {

//        DirectionService directionServiceWalking = new DirectionService(new Walking());
//        directionServiceWalking.getEta();
        DirectionService service = new DirectionService(new Walking());
        System.out.println(service.getEta()+" minutes by walking");

        // changing the state to Car
        service.setTransportationMode(new Car());
        System.out.println(service.getEta()+" minutes by car");

    }
}
