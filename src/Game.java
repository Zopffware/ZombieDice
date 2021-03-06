import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        startGame();
    }
    private static Die[] dice = new Die[3];
    private static ArrayList <Player> players = new ArrayList<>();
    private static char[] diceResults = new char[3];
    private static Scanner scanner =  new Scanner(System.in);
    private static int n = 0;

    private static void startGame() throws InterruptedException {
        int count = User.intro();

        for (int i = 0; i < count; i++) {
            System.out.println("Player " + (i + 1) + "'s name:");
            String input = scanner.nextLine();
            players.add(new Player(input, i + 1));
        }

        boolean play = true;
        while (play) {
            boolean cont = true;

            drawStats();
            delay(1000);
            generateDice();

            while (cont) {
                boolean invalid = true;
                rollDice();
                for (int i = 0; i < diceResults.length; i++) {
                    if (diceResults[i] == 'b'){
                        players.get(n).addSurvivorsCornered();
                    } else if (diceResults[i] == 's'){
                        players.get(n).addShotsFired();
                    }

                }
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                printResults();
                delay(500);
                System.out.println("");
                System.out.println(players.get(n).getName() + " has cornered " + players.get(n).getSurvivorsCornered() + " survivors");
                System.out.println(players.get(n).getName() + " has been shot " + players.get(n).getShotsFired() + " times");

                if (players.get(n).getShotsFired() >= 3){
                    drawStats();
                    System.out.println("Press enter to start next player's turn");
                    scanner.nextLine();
                    players.get(n).clearSurvivorsCornered();
                    players.get(n).resetShotsFired();
                    invalid = false;
                    cont = false;

                }

                while (invalid) {
                    System.out.println("");
                    System.out.println("Continue? (y/n)");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("y")) {
                        replaceDice();
                        invalid = false;
                    } else if (choice.equalsIgnoreCase("n")){
                        players.get(n).eat();
                        drawStats();
                        System.out.println("Press enter to start next player's turn");
                        scanner.nextLine();
                        players.get(n).clearSurvivorsCornered();
                        players.get(n).resetShotsFired();
                        cont = false;
                        invalid = false;
                    }
                }

            }
            for (Player player: players) {
                if (player.getBrainsEaten() >= 13){
                    System.out.println(player.getName() + " Wins!!!");
                    play = false;
                    break;
                }

            }


            n = n +1;
            if (n >= count){
                n =0;
            }
        }
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
            delay(500);
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
    private static void delay(int t){
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private static void drawStats(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(players.get(n).getName());
        System.out.println("-------");
        System.out.println("Brains Eaten: " + players.get(n).getBrainsEaten());
        System.out.println("Survivors cornered: " + players.get(n).getSurvivorsCornered());
        System.out.println("Shots fired: " + players.get(n).getShotsFired());
        System.out.println("");
        System.out.println("");
    }
}