import java.util.ArrayList;

public class SportsClub {
    private String name;
    private ArrayList<Person> people;

    public SportsClub(String name) {
        this.name = name;
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void showAll() {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
