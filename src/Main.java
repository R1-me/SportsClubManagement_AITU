public class Main {
    public static void main(String[] args) {

        Sport volleyball = new Sport("Volleyball", 6);
        Sport tennis = new Sport("Tennis", 1);

        Athlete athlete1 = new Athlete("Marko", 19, volleyball);
        Athlete athlete2 = new Athlete("Timur", 23, tennis);

        SportsClub club = new SportsClub("Victory Club", "Almaty");

        System.out.println(volleyball);
        System.out.println(tennis);

        System.out.println(athlete1);
        System.out.println(athlete2);

        System.out.println(club);

        System.out.println(athlete1.getAge() < athlete2.getAge());
    }
}
