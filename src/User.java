import java.util.Scanner;

public class User {

    static Scanner scanner = new Scanner(System.in);
    Player player = new Player();

    public static void intro(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("ZOMBIE DICE");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                .....            \n" +
                "                               C C  /            \n" +
                "                              /<   /             \n" +
                "               ___ __________/_#__=o             \n" +
                "              /(- /(\\_\\________   \\              \n" +
                "              \\ ) \\ )_      \\o     \\             \n" +
                "              /|\\ /|\\       |'     |             \n" +
                "                            |     _|             \n" +
                "                            /o   __\\             \n" +
                "                           / '     |             \n" +
                "                          / /      |             \n" +
                "                         /_/\\______|             \n" +
                "                        (   _(    <              \n" +
                "                         \\    \\    \\             \n" +
                "                          \\    \\    |            \n" +
                "                           \\____\\____\\           \n" +
                "                           ____\\_\\__\\_\\          \n" +
                "                         /`   /`     o\\          \n" +
                "                         |___ |_______|          \n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This game requires 2 people to play!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Player's 1 Name?");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Player.Player1 = scanner.nextLine();
        if(Player.Player1.equals("")){
            Player.Player1 = "Player 1";
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Player's 2 Name?");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Player.Player2 = scanner.nextLine();
        if(Player.Player2.equals("")){
            Player.Player2 = "Player 2";
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Player.Player1);
        System.out.println(Player.Player2);
    }
}
