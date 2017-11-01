public class Player {
    private String name;
    private int brainsEaten = 0;
    private int survivorsCornered = 0;
    private int shotsFired = 0;


    String getName() {
        return name;
    }
    Player(String playerName, int playerNumber) {
        if (playerName.equals("")) {
            name = "Player " + playerNumber;
        } else {
            name = playerName;
        }
    }
    int getBrainsEaten() {
        return brainsEaten;
    }
    void eat() {
        brainsEaten += survivorsCornered;
        clearSurvivorsCornered();
    }
    int getSurvivorsCornered() {
        return survivorsCornered;
    }
    void addSurvivorsCornered() {
            survivorsCornered ++;
    }
    void clearSurvivorsCornered() {
        survivorsCornered = 0;
    }
    int getShotsFired() {
        return shotsFired;
    }
    void addShotsFired() {
        shotsFired ++;
    }
    void resetShotsFired() {
        shotsFired = 0;
    }
}
