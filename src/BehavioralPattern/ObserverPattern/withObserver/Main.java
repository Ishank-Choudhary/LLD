package BehavioralPattern.ObserverPattern.withObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice displayDevice1 = new DisplayDevice("Mobile"); // this is a type of observer
        DisplayDevice displayDevice2 = new DisplayDevice("Tablet");
        weatherStation.attach(displayDevice1);
        weatherStation.attach(displayDevice2);

        weatherStation.setTemp(23); // this will notify all users with same temperature


    }
}
