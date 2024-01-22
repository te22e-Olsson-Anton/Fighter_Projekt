import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        boolean spelStart = false;

        Scanner tangetbord = new Scanner(System.in);

        System.out.println("1. För att starta spelet");
        String start = tangetbord.nextLine();
        
        if(start.equalsIgnoreCase("1"))
        {
            spelStart = true;
        }

        

        while (spelStart) 
        {
            System.out.println("Spelet är startat");
        }

    
      }
}

