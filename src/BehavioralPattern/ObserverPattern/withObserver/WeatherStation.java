package BehavioralPattern.ObserverPattern.withObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private float temp;
    private List<Observer> observerList = new ArrayList<>(); // internally it stores [ DisplayDevice object, DisplayDevice object ]

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observerList.size();i++){
            Observer o = observerList.get(i);
            o.update(temp); // we are updating all the devices from the app
        }
    }
}

// our app(whether station) posting updates for users(Display Device)