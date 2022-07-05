package behavioral.observer.simpleexample;

// Observer: the one observing the changes, listening to receive any notification from the observables
public interface Observer {
    public void update(int pressure, int temperature, int humidiy);
}
