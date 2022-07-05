package creational.builder.innerbuilder;

public class Person {
    // mandatory fields
    public String name;
    public String email;
    // optinal fields;
    public int age;
    public String address;

    public Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", email=" + email + ", name=" + name + "]";
    }

    public static class Builder {

        // mandatory fields
        public final String name;
        public final String email;
        // optional fields
        public int age;
        public String address;
        public String position;

        // mandatory fields go in the constructor
        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // optional fields with setters
        public Builder setAdress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            // this is the builder
            return new Person(this);
        }

    }
}
