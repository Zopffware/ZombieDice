import java.util.Scanner;

public class User {

    private static Scanner scanner = new Scanner(System.in);

    public static int intro() {
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
        boolean cont = true;
        int amount = 0;
        while (cont) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("How many players? (2-4): ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            amount = scanner.nextInt();
            if (amount >= 2 && amount <= 4) {
//            scanner.nextLine();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                cont = false;
            } else {
                System.out.println("Please enter a valid number of players (2-4): ");
            }
        }
            return amount;

    }
}
