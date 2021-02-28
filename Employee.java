public abstract class Employee {
    private String firstName;
    private String lastName;
    private String id;

    public Employee(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Employee() {
        firstName = "plony";
        lastName = "almony";
        id = "0";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "Name: " + firstName +" " + lastName + "\n" +
                "id: " + id + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee=(Employee)obj;
        return firstName.equals(employee.firstName)&&lastName.equals(employee.lastName)&&id.equals(employee.id);
    }

    public abstract float earnings();
}
