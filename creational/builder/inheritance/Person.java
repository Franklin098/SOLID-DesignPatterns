package creational.builder.inheritance;

public class Person {
    // mandatory fields
    public String name;
    public String email;
    // optinal fields;
    public int age;
    public String address;
    public String position;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", email=" + email + ", name=" + name + ", position="
                + position + "]";
    }
}
