package behavioral.observer.simpleexample;

public class AnotherObserver implements Observer {

    public AnotherObserver(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidiy) {
        System.out.println("AnotherObserver knows that weather has changed");
    }

}
