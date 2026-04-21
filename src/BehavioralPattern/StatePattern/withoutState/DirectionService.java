package BehavioralPattern.StatePattern.withoutState;

enum TransportationMode{
    WALKING,CYCLING,CAR,TRAIN
}

public class DirectionService {
    private TransportationMode transportationMode;

    public TransportationMode getTransportationMode() {
        return transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void getETA(){
        switch (transportationMode){
            case WALKING:
                System.out.println("10 min eta for walking");
                break;
            case CAR:
                System.out.println("10 min eta for car");
                break;
            case TRAIN:
                System.out.println("10 min eta for train");
                break;
            case CYCLING:
                System.out.println("10 min eta for cycling");
                break;
            default:
                throw new IllegalArgumentException("Unknown Mode");
        }
    }
}
