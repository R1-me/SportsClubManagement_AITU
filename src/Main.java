public class Main {
    public static void main(String[] args) {

        Sport football = new Sport("Football", 11);
        Sport tennis = new Sport("Tennis", 1);

        Athlete a1 = new Athlete("Marko", 19, football);
        Athlete a2 = new Athlete("Timur", 22, tennis);

        Coach coach = new Coach("John", 45, "Football");

        Training training = new Training("Monday", coach, football);

        SportsClub club = new SportsClub("Victory Club");

        club.addPerson(a1);
        club.addPerson(a2);
        club.addPerson(coach);

        System.out.println("People in club:");
        club.showAll();

        System.out.println("\nTraining info:");
        System.out.println(training);
    }
}
