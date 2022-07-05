# Inheritance with builders

Fluent chains don't work well in inheritance because of the method Builder return types.

Recursive generics in java to solve builder inheritance problems.


```
public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    
    //...

    public SELF setAge(int age) {
        person.age = age;
        return self();
    }

    // we are goint to override the behaviour of self in derived classes
    protected SELF self() {
        return (SELF) this;
    }
}
```
```
public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    // ...

}
```