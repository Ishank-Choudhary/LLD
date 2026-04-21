package BehavioralPattern.StatePattern.withState;

public class DirectionService {

    private TransportationState transportationMode;

    public DirectionService(TransportationState transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationState transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getEta(){
        return transportationMode.calculateETA();
    }

    public String getDirection(){
        return transportationMode.getDirection();
    }
}
