package creational.builder.inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new EmployeeBuilder("Kevin", "kev@gmail.com")
                .setAdress("24 av")
                .setPosition("manager")
                .build();
        System.out.println(person.toString());
    }
}
