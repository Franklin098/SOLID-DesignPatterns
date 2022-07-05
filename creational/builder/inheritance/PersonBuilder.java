package creational.builder.inheritance;

// fluent chains don't work well in inheritance because of the method Builder return types
// recursive generics in java to solve builder inheritance problems
public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person;

    // mandatory fields go in the constructor
    public PersonBuilder(String name, String email) {
        person = new Person(name, email);
    }

    // optional fields with setters
    public SELF setAdress(String address) {
        person.address = address;
        return self();
    }

    public SELF setAge(int age) {
        person.age = age;
        return self();
    }

    public Person build() {
        // this is the builder
        return this.person;
    }

    // we are goint to override the behaviour of self in derived classes
    protected SELF self() {
        return (SELF) this;
    }

}