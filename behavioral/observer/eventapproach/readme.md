# Observer Pattern wit Event approach

We create an 'Event' which is a set of subscriptions.

This approach help us to avoid implementing an interface or inherit from a class just for behing an observable.

Previous Naive Approach:

```
public class Person extends Observable<Person> {

    // ... 

    public void setAge(int age) {
        // we want to be informed that the age has changed
        if (this.age == age)
            return;
        this.age = age;
        // inherits from Observable
        propertyChanged(this, "age", age);
    }
}
```

With Event Approach:

```
public class Person {

    // We are saying to the clients 'If you want to get notifications of this event
    // you can subscribe to it'.
    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();

    //...

    public void setAge(int age) {
        // we want to be informed that the age has changed
        if (this.age == age)
            return;
        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(this, "age", age));
    }
}
```

