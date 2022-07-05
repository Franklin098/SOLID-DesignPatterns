package behavioral.observer.generalapproach;

// we want to get notify whenever a property of pereson has chaged
// so Person is our Observable
public class Person extends Observable<Person> {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // we want to be informed that the age has changed
        if (this.age == age)
            return;
        this.age = age;
        // inherits from Observable
        propertyChanged(this, "age", age);
    }

}
