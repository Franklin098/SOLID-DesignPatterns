package behavioral.observer.eventapproach;

// we want to get notify whenever a property of pereson has chaged
// so Person is our Observable
public class Person {

    // We are saying to the clients 'If you want to get notifications of this event
    // you can subscribe to it'.
    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // we want to be informed that the age has changed
        if (this.age == age)
            return;
        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(this, "age", age));
    }

}
