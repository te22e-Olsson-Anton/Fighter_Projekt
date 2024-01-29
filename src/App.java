import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class App
{

    public static void main(String[] args) throws Exception {
        
        boolean gameStart = false;
        boolean enemy = false;

        int playerHP = 100;
        int enemeyHP = 100;

        Scanner tb = new Scanner(System.in);
        Random random = new Random();

        System.out.println("---------------------------");
        System.out.println("1. För att starta spelet");
        System.out.println("2. Inställningar");
        System.out.println("3. Regler");
        System.out.println("---------------------------");

        String start = tb.nextLine();
        
        if(start.equalsIgnoreCase("1"))
        {
            gameStart = true;
        }
        else if(start.equalsIgnoreCase("2"))
        {

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

        while (gameStart) 
        {
            
        System.out.println("Nuvarande Plats " +map[playerRow][playerCol]);


        System.out.println("Tryck på W för att röra dig uppåt");
        System.out.println("Tryck på A för att röra dig nedåt");
        System.out.println("Tryck på S för att röra dig åt höger");
        System.out.println("Tryck på D för att röra dig åt vänster");

        String input = tb.nextLine();

        if(input.equalsIgnoreCase("W"))
        {
            playerRow--;
        }
        else if(input.equalsIgnoreCase("A"))
        {
            playerCol--;
        }
        else if(input.equalsIgnoreCase("S"))
        {
            playerRow++;
        }
        else if(input.equalsIgnoreCase("D"))
        {
            playerCol++;
        }
        else if(input.equalsIgnoreCase("Q"))
        {
            gameStart = false;
        }
        


        if(playerRow==-1)
        {
            playerRow++;
        }
        if(playerRow==5)
        {
            playerRow--;
        }
        if(playerCol==-1)
        {
            playerCol++;
        }
        if(playerCol==5)
        {
            playerCol--;
        }


        if(playerRow==3 && playerCol == 4)
        {
            System.out.println("EN FIENDE");
            enemy = true;
            

           while (enemy) 
           {
                System.out.println("Din tur att slå");
                System.out.println("Tryck space för att slå");

                String fight = tb.nextLine();

                if(fight.equals(" "))
                {
                    int randomNumberFight1 = random.nextInt(10);
                    
                    System.out.println(randomNumberFight1);
                    Thread.sleep(1000);
                    if(randomNumberFight1 > 5)
                    {
                        System.out.println("Du lyckades slå fienden!");
                        int randomNumberDamage1 = random.nextInt(15);

                        enemeyHP -= randomNumberDamage1;

                        System.out.println("Du slog fienden med " +randomNumberDamage1+ " skada");
                        System.out.println("Fienden har nu " +enemeyHP+ " liv och du har nu" +playerHP+ " liv");
                    }
                    else
                    {
                        System.out.println("Du missade ditt slag!");
                        Thread.sleep(5000);
                    }

                    System.out.println("Fiendens tur att slå");
                    

                    

                    
                }
                

                
                
                
           }
        }


        


 
    }

    
        }
    }

