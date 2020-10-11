import java.util.concurrent.ThreadLocalRandom;

public class Magic8 
{

    public static void main(String[] args) 
    {

        for (int i = 0; i < 101; i++)
        {
            double calculate = Math.random() * (9) + 1;

            int fortune = (int)Math.round(calculate);

            switch (fortune) 
            {
                case (1):
                    System.out.println("You'll learn some basic code");
                    break;
                case (2):
                    System.out.println("The computer saw you typed 'Hello World' and responded with 'Hello Human'");
                    break;
                case (3):
                    System.out.println("It's going to rain");
                    break;
                case (4):
                    System.out.println("The muppests are running for President");    
                    break;
                case (5):
                    System.out.println("Try again");    
                    break;
                case (6):  
                    System.out.println("Ask again later");    
                    break;
                case (7):
                    System.out.println("Busy eating pizza");
                    break;
                case (8): 
                    System.out.println("You will find great riches... if code bugs were riches");    
                    break;
                case (9):    
                    System.out.println("Have you fixed the bugs yet?");    
                    break;
                case (10):  
                    System.out.println("Ask again when the bugs are all gone"); 
                    break;
                default:
                    System.out.println("Somehow you broke it, not sure how");
            }
        }
        
    }

}