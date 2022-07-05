package behavioral.observer.generalapproach;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
