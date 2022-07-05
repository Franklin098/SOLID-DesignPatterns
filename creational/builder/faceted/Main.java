package creational.builder.faceted;

public class Main {
    public static void main(String[] args) {

        Animal animal = new AnimalBuilder()
                .setName("Tobby")
                .setAnimalAge(11)
                .setEyesColor("blue")
                .ownedBy()
                .setOwnerName("Franklin")
                .setOwnerAge(24)
                .withDiet()
                .setNumberOfMeals(2)
                .setPreferedFood("rice and chicken")
                .build();

        // we can change between different builders

        System.out.println("faceted Animal build example: " + animal.toString());
    }
}
