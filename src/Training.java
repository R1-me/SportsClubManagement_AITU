public class Training {
    private String day;
    private Coach coach;
    private Sport sport;

    public Training(String day, Coach coach, Sport sport) {
        this.day = day;
        this.coach = coach;
        this.sport = sport;
    }

    public String getDay() {
        return day;
    }

    public Coach getCoach() {
        return coach;
    }

    public Sport getSport() {
        return sport;
    }

    public String toString() {
        return "Training on " + day +
                ", coach: " + coach.getName() +
                ", sport: " + sport.getName();
    }
}
