public class Game {
    public static void main(String[] args) {
        startGame();
    }
    private static Die[] dice = new Die[3];
    private static char[] diceResults = new char[3];
    private static void startGame() {
        User.intro();
    }
    private static void generateDice() {        //Fills the dice array with entirely new dice
        for (int i = 0; i < dice.length; i++) {
            dice[i] = Cup.newDie();             //Change according to cup class
        }
    }
    private static void replaceDice() {         //Replaces dice that have not rolled footprints with new dice
        for (int i = 0; i < dice.length; i++) {
            if (diceResults[i] != 'f') {
                dice[i] = Cup.newDie();         //Change according to cup class
            }
        }
    }
    private static void rollDice() {            //Rolls all dice in the dice array and stores the results in diceResults
        for (int i = 0; i < dice.length; i++) {
            diceResults[i] = dice[i].rollDie();
        }
    }
    private static void printResults() {        //Prints the results of the dice roll to the player
        for (int i = 0; i < dice.length; i++) {
            System.out.print("Victim " + (i + 1));
            switch (dice[i].getDifficulty()) {
                case 'e':
                    System.out.print(" (easy): ");
                    break;
                case 'm':
                    System.out.print(" (medium): ");
                    break;
                case 'h':
                    System.out.print(" (hard): ");
                    break;
                default:
                    System.err.println("Invalid difficulty");
            }
            switch (diceResults[i]) {
                case 'b':
                    System.out.println("Cornered!");
                    break;
                case 'f':
                    System.out.println("Escaped...");
                    break;
                case 's':
                    System.out.println("Retaliated!");
                    break;
                default:
                    System.err.println("Invalid result");
            }
        }
    }
}