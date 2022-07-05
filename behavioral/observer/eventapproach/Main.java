package behavioral.observer.eventapproach;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        // now we can save the subscription to unsubscripte latter on

        Event<PropertyChangedEventArgs>.Subscription sub = person.propertyChanged.addHandler(x -> {
            System.out.println("Person's " + x.propertyName + " has changed");
        });

        person.setAge(17);
        person.setAge(21);

        // unsubscribe
        sub.close();

        person.setAge(33);

        // we are expecting to receive just 2 notifications, since we unsubscribe before
        // the third change
    }
}
