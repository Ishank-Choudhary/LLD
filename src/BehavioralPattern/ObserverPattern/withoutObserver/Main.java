package BehavioralPattern.ObserverPattern.withoutObserver;

public class Main {
    public static void main(String[] args) {

        DisplayDevice displayDevice = new DisplayDevice();
        WheatherStation wheatherStation = new WheatherStation(displayDevice);

        wheatherStation.setTemprature(20);
        wheatherStation.setTemprature(30);
    }
}
