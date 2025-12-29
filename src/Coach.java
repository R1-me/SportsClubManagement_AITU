public class Coach extends Person {
    private String specialty;

    public Coach(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String getRole() {
        return "Coach";
    }

    @Override
    public String toString() {
        return name + ", age: " + age + ", coach of " + specialty;
    }
}

