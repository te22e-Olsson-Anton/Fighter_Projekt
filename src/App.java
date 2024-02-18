import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class App {

    public static void main(String[] args) throws Exception {

        boolean gameStart = false;
        boolean enemy = false;

        int playerHP = 50;
        int enemeyHP = 50;

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("---------------------------");
        System.out.println("1. För att starta spelet");
        System.out.println("Målet är att hitta och döda fienden");
        System.out.println("---------------------------");

        String start = keyboard.nextLine();

        if (start.equalsIgnoreCase("1")) 
        {
            gameStart = true;
        }
        String[][] map = new String[5][5];

        int playerRow = 2;
        int playerCol = 2;

        map[0][0] = "Stad";
        map[0][1] = "Strand";
        map[0][2] = "Strand";
        map[0][3] = "Strand";
        map[0][4] = "Avgrund";

        map[1][0] = "Berg";
        map[1][1] = "Flod";
        map[1][2] = "Vetefält";
        map[1][3] = "Skog";
        map[1][4] = "Avgrund";

        map[2][0] = "Berg";
        map[2][1] = "Slumpmark";
        map[2][2] = "Skog";
        map[2][3] = "Mörk skog";
        map[2][4] = "Avgrund";

        map[3][0] = "Berg";
        map[3][1] = "Slumpmark";
        map[3][2] = "Skog";
        map[3][3] = "Skog";
        map[3][4] = "Fiende";

        map[4][1] = "En mur";
        map[4][0] = "En mur";
        map[4][2] = "Dörr i muren";
        map[4][3] = "En mur";
        map[4][4] = "En mur";

        while (gameStart) {

            System.out.println("Nuvarande Plats " + map[playerRow][playerCol]);

            System.out.println("Tryck på W för att röra dig uppåt");
            System.out.println("Tryck på A för att röra dig nedåt");
            System.out.println("Tryck på S för att röra dig åt höger");
            System.out.println("Tryck på D för att röra dig åt vänster");

            String input = keyboard.nextLine();

            if (input.equalsIgnoreCase("W")) {
                playerRow--;
            } else if (input.equalsIgnoreCase("A")) {
                playerCol--;
            } else if (input.equalsIgnoreCase("S")) {
                playerRow++;
            } else if (input.equalsIgnoreCase("D")) {
                playerCol++;
            } else if (input.equalsIgnoreCase("Q")) {
                gameStart = false;
            }

            if (playerRow == -1) {
                playerRow++;
            }
            if (playerRow == 5) {
                playerRow--;
            }
            if (playerCol == -1) {
                playerCol++;
            }
            if (playerCol == 5) {
                playerCol--;
            }

            if (playerRow == 3 && playerCol == 4) {
                System.out.println("EN FIENDE");
                enemy = true;

                while (enemy) {
                    System.out.println("Din tur att slå");
                    System.out.println("Tryck space för att slå");

                    String fight = keyboard.nextLine();
                    
                    if (fight.equals(" ")) {
                        int randomNumberFight1 = random.nextInt(15);

                        System.out.println(randomNumberFight1);
                        Thread.sleep(1000);
                        if (randomNumberFight1 > 5) {

                            System.out.println("Du lyckades slå fienden!");
                            Thread.sleep(1000);
                            int randomNumberDamage1 = random.nextInt(15);

                            enemeyHP -= randomNumberDamage1;

                            System.out.println("Du slog fienden med " + randomNumberDamage1 + " skada");
                            Thread.sleep(2000);
                            System.out.println("Fienden har nu " + enemeyHP + " liv och du har nu " + playerHP + " liv");
                            Thread.sleep(2000);
                        } else 
                        {
                            System.out.println("Du missade ditt slag!");
                            Thread.sleep(1000);
                            
                        }

                        System.out.println("Fiendens tur att slå");
                        Thread.sleep(1000);
                        int randomNumberFight2 = random.nextInt(15);

                        if (randomNumberFight2 > 5) {
                            
                            System.out.println("Fienden lyckades slå dig");
                            Thread.sleep(1000);
                            int randomNumberDamage2 = random.nextInt(15);

                            playerHP -= randomNumberDamage2;

                            System.out.println("Fienden slog dig med " + randomNumberDamage2 + " skada");
                            Thread.sleep(2000);
                            System.out.println("Du har nu " + playerHP + " liv kvar och fienden har nu " + enemeyHP + " liv");
                            Thread.sleep(2000);
                        } else 
                        {
                            System.out.println("Fienden missade sitt slag");
                            Thread.sleep(1000);
                        }

                        if (playerHP <= 0) 
                        {
                            System.out.println("du har förlorat");
                            enemy = false;
                            playerHP = 50;
                            enemeyHP = 50;
                            playerRow = 2;
                            playerCol = 2;
                        }
                        if (enemeyHP <= 0) 
                        {
                            System.out.println("Du vann");
                            enemy = false;
                            playerRow = 2;
                            playerCol = 2;
                        }

                    }

                }
            }

        }

    }
}