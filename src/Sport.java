public class Sport {
    private String name;
    private int players;
    public Sport(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public String toString() {
        return name + " (" + players + " players)";
    }
}
