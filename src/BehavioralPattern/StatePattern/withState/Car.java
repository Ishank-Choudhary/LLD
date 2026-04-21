package BehavioralPattern.StatePattern.withState;

public class Car implements TransportationState {
    @Override
    public int calculateETA() {
        return 2;
    }

    @Override
    public String getDirection() {
        return "Going West";
    }
}
