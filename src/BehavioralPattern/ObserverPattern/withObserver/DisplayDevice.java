package BehavioralPattern.ObserverPattern.withObserver;

// this will behave as a user getting the updates from the app WhetherSation
public class DisplayDevice implements Observer{

    private String deviceName;

    public DisplayDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println(deviceName+ ": The current temprature is: "+temp+"°C");
    }
}
