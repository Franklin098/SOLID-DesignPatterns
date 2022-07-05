package creational.builder.faceted;

public class Animal {
    // animal information
    public String name;
    public String eyesColor;
    public int age;

    // owner information
    public String ownerName;
    public int ownerAge;

    // diet information
    public String preferdFood;
    public int numberofMeals;

    // We want to create 3 builders: one for animal information, other for owner
    // information and finally another for diet inforamtion.

    @Override
    public String toString() {
        return "Animal [age=" + age + ", eyesColor=" + eyesColor + ", name=" + name + ", numberofMeals=" + numberofMeals
                + ", ownerAge=" + ownerAge + ", ownerName=" + ownerName + ", preferdFood=" + preferdFood + "]";
    }

}
