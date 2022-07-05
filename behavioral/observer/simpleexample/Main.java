package behavioral.observer.simpleexample;

public class Main {

    public static void main(String[] args) {
        // Observable, the one doing the changes and notifying to the observers
        WeatherStation weatherStation = new WeatherStation();

        // We want to observe changes in weather station, we can create multiple
        // observers
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
        weatherObserver.toString(); // avoid IDE warining of unsued variable

        AnotherObserver anotherObserver = new AnotherObserver(weatherStation);
        anotherObserver.toString(); // avoid IDE warining of unsued variable

        weatherStation.setHumidiy(20);
        weatherStation.setTemperature(300);

    }
}
