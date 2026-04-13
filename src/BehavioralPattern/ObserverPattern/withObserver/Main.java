package BehavioralPattern.ObserverPattern.withObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice displayDevice = new DisplayDevice("Mobile"); // this is a type of observer
        weatherStation.attach(displayDevice);
        weatherStation.setTemp(23);

    }
}
