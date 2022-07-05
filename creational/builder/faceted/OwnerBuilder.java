package creational.builder.faceted;

public class OwnerBuilder extends AnimalBuilder {

    public OwnerBuilder(Animal animal) {
        this.animal = animal;
    }

    public OwnerBuilder setOwnerName(String ownerName) {
        this.animal.ownerName = ownerName;
        return this;
    }

    public OwnerBuilder setOwnerAge(int age) {
        this.animal.ownerAge = age;
        return this;
    }
}
