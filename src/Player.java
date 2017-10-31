public class Player {
    private String name;
    private int brainsEaten = 0;
    private int survivorsCornered = 0;
    private int shotsFired = 0;


    public Player(String playerName, int brains, int survivors, int shots) {
        name = playerName;
        brainsEaten = brains;
        survivorsCornered = survivors;
        shotsFired = shots;
    }

    public String getName() {
        return name;
    }
    public void setName(String playerName, int playerNumber) {
        if (playerName.equals("")) {
            name = "Player " + playerNumber;
        } else {
            name = playerName;
        }
    }
    public int getBrainsEaten() {
        return brainsEaten;
    }
    public void eat() {
        brainsEaten += survivorsCornered;
        clearSurvivorsCornered();
    }
    public int getSurvivorsCornered() {
        return survivorsCornered;
    }
    public void addSurvivorsCornered(int number) {
        if (number <= 3) {
            survivorsCornered += number;
        } else {
            System.err.println("Invalid number of survivors cornered.");
        }
    }
    public void clearSurvivorsCornered() {
        survivorsCornered = 0;
    }
    public int getShotsFired() {
        return shotsFired;
    }
    public void setShotsFired(int number) {
        shotsFired += number;
    }
    public void resetShotsFired () {
        shotsFired = 0;
    }
}
