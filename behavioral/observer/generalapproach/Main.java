package behavioral.observer.generalapproach;

public class Main implements Observer<Person> {

    public Main() {
        Person person = new Person();
        // I'm the Observer
        person.subscribe(this);
        for (int i = 20; i < 24; i++) {
            person.setAge(i);
        }
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.propertyName + " has changed to " + args.newValue);
    }

    public static void main(String[] args) {
        new Main();
    }

}
