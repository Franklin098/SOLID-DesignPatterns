package creational.builder.inheritance;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder(String name, String email) {
        super(name, email);
    }

    public EmployeeBuilder setPosition(String position) {
        super.person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }

}
