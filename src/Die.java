import java.util.Random;

public class Die {
    private char difficulty;
    public void setDifficulty(char d) {
        if (d == 'e' || d == 'm' || d == 'h') {
            difficulty = d;
        } else {
            System.err.println("Die difficulty set incorrectly");
            difficulty = 'h';
        }
    }
    public char getDifficulty() {
        return difficulty;
    }
    public char rollDie() {
        Random random = new Random();
        int rollResult = random.nextInt(5);
        switch (difficulty) {
            case 'e':
                if (rollResult <= 2) {
                    return 'b';
                } else if (rollResult <= 4) {
                    return 'f';
                } else {
                    return 's';
                }
            case 'm':
                if (rollResult <= 1) {
                    return 'b';
                } else if (rollResult <= 3) {
                    return 'f';
                } else {
                    return 's';
                }
            case 'h':
                if (rollResult == 0) {
                    return 'b';
                } else if (rollResult <= 2) {
                    return 'f';
                } else {
                    return 's';
                }
            default:
                System.err.println("Invalid difficulty");
                return 's';
        }
    }
}
