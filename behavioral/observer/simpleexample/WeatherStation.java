package behavioral.observer.simpleexample;

import java.util.ArrayList;
import java.util.List;

// the Obserable, the one doing the changes and notifying to all the observers that something has changed.
public class WeatherStation implements Subject {

    private int pressure;
    private int temperature;
    private int humidiy;

    // list of observers who are looking at this observable
    List<Observer> observerList;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : this.observerList) {
            o.update(pressure, temperature, humidiy);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidiy(int humidiy) {
        this.humidiy = humidiy;
        notifyAllObservers();
    }

}
