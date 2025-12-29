public class Athlete extends Person {
    private Sport sport;

    public Athlete(String name, int age, Sport sport) {
        super(name, age);
        this.sport = sport;
    }

    public Sport getSport() {
        return sport;
    }
    @Override
    public String getRole() {
        return "Athlete";
    }
    @Override
    public String toString() {
        return name + ", age: " + age + ", sport: " + sport.getName();
    }
}
