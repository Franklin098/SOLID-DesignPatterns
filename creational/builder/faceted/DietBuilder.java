package creational.builder.faceted;

public class DietBuilder extends AnimalBuilder {

    DietBuilder(Animal animal) {
        this.animal = animal;
    }

    public DietBuilder setPreferedFood(String food) {
        this.animal.preferdFood = food;
        return this;
    }

    public DietBuilder setNumberOfMeals(int numberofMeals) {
        this.animal.numberofMeals = numberofMeals;
        return this;
    }
}
