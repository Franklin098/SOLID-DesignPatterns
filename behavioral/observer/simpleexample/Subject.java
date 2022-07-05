package behavioral.observer.simpleexample;

// the Obserable, the one doing the changes and notifying to all the observers that something has changed.
public interface Subject {
    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    // notify to all observers that something changed.
    public void notifyAllObservers();
}
