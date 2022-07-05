# Observer Pattern

Defines one-to-many dependency between given objects or entities.

* When one object changes state all of its dependencies are notified and updadated automatically.

We want to be informed when certain things happen:

* Object's field changes
* Object does something
* Some external event occurs

The Subject/Observable is the object that is being monitored

Observers (or listeners) are dependending on the subject and waiting for events.

Benefits:

* Achieve loosely couple software systems.
* When two objects are loosely coupled they can interact but they have little knowledge of each other. The only think the subject knows about an observer is taht it implements a certain interface
* We can add new observers whenever we want. Without modifying the subject.
* We can change the subject or observer independently.
* Loosley couple design help to create flexible systems that handle changes very well.

In the past a typical pattern in Java involves addXXXListener(), but now Java suports functional objects like: Supplier<T>, Consumer<T>, Function<T> so we can add them to a list and trigger them.

Observer:  The one looking to the changes, listening to receive any notification, watching or observing.
Observable: The one triggering the event updates, the one doing the changes, the one we want to observe.

> simpleexample package provides a concrete easy example of the pattern in practice.

> generalapproach package provides a more general an generic approach of the observable pattern

> evenapproach package provides a modern way of implementic observabvle pattern without needing to implement or extend for any class and using the concept of events and Java functional objects. 

![observer-pattern](/images/observer.png)