package behavioral.observer.simpleexample;

// Observer: the one observing the changes, listening to receive any notification from the observables
// doing and processing the changes in the way we want
public class WeatherObserver implements Observer {

    private int pressure;
    private int temperature;
    private int humidiy;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        // we want to be observers, listen to the changes
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidiy) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidiy = humidiy;
        System.out.println("WeatherObserver got notfied " + this.toString());
    }

    @Override
    public String toString() {
        return "changes: [humidiy=" + humidiy + ", pressure=" + pressure
                + ", temperature=" + temperature + "]";
    }

}
