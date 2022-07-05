package behavioral.observer.generalapproach;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
    // list of observers who are looking at this observable
    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source, String propertyName, Object newValue) {
        for (Observer<T> observer : observers) {
            observer.handle(new PropertyChangedEventArgs<T>(source, propertyName, newValue));
        }
    }
}
