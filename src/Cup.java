import java.util.Random;

public class Cup {
    public static Die newDie() {
        Die die = new Die();
        Random random = new Random();
        int difficulty = random.nextInt(99);
        if (difficulty < 46) {
            die.setDifficulty('e');
        } else if (difficulty < 77) {
            die.setDifficulty('m');
        } else {
            die.setDifficulty('h');
        }
        return die;
    }
}
