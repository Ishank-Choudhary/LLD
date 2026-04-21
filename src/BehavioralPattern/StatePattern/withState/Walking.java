package BehavioralPattern.StatePattern.withState;

public class Walking implements TransportationState {
    @Override
    public int calculateETA() {
        return 10;
    }

    @Override
    public String getDirection() {
        return "Going East";
    }
}
