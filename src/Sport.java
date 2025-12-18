public class Sport {
    private String name;
    private int numberOfPlayers;

    public Sport(String name, int numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String toString() {
        return name + " (" + numberOfPlayers + ")";
    }
}
