import java.util.Scanner;

public class GameLogic {

    public static void startGame(){

        System.out.println("Welcome to Zombie Dice");

        Scanner scanner = new Scanner(System.in);

//        Player player1 = new Player();
//        Player player2 = new Player();
//        User user = new User();
//        Game game = new Game();

        boolean playingGame = true;
        boolean playerOneTurn = true;
        boolean playerTwoTurn = false;

        while (playingGame){

            while(playerOneTurn){

                takeTurn ();

            }
            while (playerTwoTurn){

                takeTurn();

            }
        }
    }
    private static void playerStats(){



    }
    private static void generateDice(){

        System.out.println("Generated Die");
        Die die = new Die();
        die.getDifficulty();
        die.rollDie();


    }

    private static void takeAction(){

        System.out.println("Would you like to take another turn?");

    }

    private static void check(){

        System.out.println("Check Stats");

    }

    private static void takeTurn() {

        playerStats();
        generateDice();
        check();
        takeAction();
    }
}
