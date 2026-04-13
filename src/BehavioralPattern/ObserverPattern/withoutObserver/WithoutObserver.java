package BehavioralPattern.ObserverPattern.withoutObserver;

class DisplayDevice{
    public void showTemp(float temp){
        System.out.println("Current temprature: "+temp);
    }
}
class WheatherStation{
    private float temprature;
    private DisplayDevice displayDevice;

    public WheatherStation(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
        notifyDevice(); // as soon as temp changes through setter we are calling the notify method
    }

    public void notifyDevice(){
        displayDevice.showTemp(temprature);
    }

}
public class WithoutObserver {
}
