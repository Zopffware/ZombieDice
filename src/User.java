import java.util.Scanner;

public class User {

    static Scanner scanner = new Scanner(System.in);
    static String input = "";
    static int amount = 0;
    static boolean cont = true;
    static Player player = new Player();

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
        while(cont) {
            System.out.println("How many players? (2-4): ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            amount = scanner.nextInt();
            scanner.nextLine();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (amount == 4) {
                for(int a = 0; a<4; a++) {
                    System.out.println("Player " + (a + 1) + "'s Name?");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    input = scanner.nextLine();
                    player.setName(input, a);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                cont = false;
            } else if (amount == 3) {
                for(int a = 0; a<3; a++) {
                    System.out.println("Player " + (a + 1) + "'s Name?");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    input = scanner.nextLine();
                    player.setName(input, a);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                cont = false;
            } else if (amount == 2) {
                    for(int a = 0; a<2; a++) {
                        System.out.println("Player " + (a + 1) + "'s Name?");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        input = scanner.nextLine();
                        player.setName(input, a);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                cont = false;
            } else {
                System.out.println("***That's not a valid amount of players!***");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
