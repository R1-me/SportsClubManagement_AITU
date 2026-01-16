import java.sql.*;

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
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/OOP_Sports_club_MS",
                    "postgres",
                    "787899KAA"
            );

            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO sport (name) VALUES ('Boxing')");
            stmt.executeUpdate("INSERT INTO sport (name) VALUES ('Football')");

            stmt.executeUpdate("INSERT INTO athlete (name, age, sport_id) VALUES ('Abylay', 21, 1),('Timur', 19, 2)");


            ResultSet rs = stmt.executeQuery(
                    "SELECT athlete.name, athlete.age, sport.name AS sport " +
                            "FROM athlete JOIN sport ON athlete.sport_id = sport.id"
            );

            while (rs.next()) {
                System.out.println(
                        rs.getString("name") + "  " +
                                rs.getInt("age") + "  " +
                                rs.getString("sport")
                );
            }

            stmt.executeUpdate("UPDATE athlete SET age = 22 WHERE name = 'Abylay'");


            stmt.executeUpdate("DELETE FROM athlete WHERE name = 'Timur'");
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Database error occurred");
            e.printStackTrace();
        }

    }
}
