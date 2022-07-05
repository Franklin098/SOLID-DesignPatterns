package creational.builder.faceted;

public class AnimalBuilder {
    protected Animal animal = new Animal();

    public Animal build() {
        return animal;
    }

    public AnimalBuilder setName(String name) {
        animal.name = name;
        return this;
    }

    public AnimalBuilder setEyesColor(String eyesColor) {
        animal.eyesColor = eyesColor;
        return this;
    }

    public AnimalBuilder setAnimalAge(int age) {
        animal.age = age;
        return this;
    }

    public OwnerBuilder ownedBy() {
        return new OwnerBuilder(this.animal);
    }

    public DietBuilder withDiet() {
        return new DietBuilder(this.animal);
    }

}
