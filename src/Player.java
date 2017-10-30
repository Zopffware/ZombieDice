public class Player {
    private String name;
    private int brainsEaten = 0;
    private int survivorsCornered = 0;
    private int shotsFired = 0;
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
    public void addBrainsEaten(int number) {
        brainsEaten += number;
    }
    public int getSurvivorsCornered() {
        return survivorsCornered;
    }
    public void setSurvivorsCornered(int number) {
        survivorsCornered = number;
    }
    public int getShotsFired() {
        return shotsFired;
    }
    public void setShotsFired(int number) {
        shotsFired = number;
    }
}
