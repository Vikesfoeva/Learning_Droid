import java.util.concurrent.ThreadLocalRandom;

public class Magic8 
{
    public static void main(String[] args) 
    {
        int tallyOne;
        int tallyTwo;
        int tallyThree;
        int tallyFour;
        int tallyFive;
        int tallySix;
        int tallySeven;
        int tallyEight;
        int tallyNine;
        int tallyTen;

        for (int i = 0; i < 101; i++)
        {
            double calculate = Math.random() * (9) + 1;

            int fortune = (int)Math.round(calculate);

            switch (fortune) 
            {
                case (1):
                    tallyOne +=1;
                    System.out.println("You'll learn some basic code");
                    break;
                case (2):
                    tallyTwo +=1;
                    System.out.println("The computer saw you typed 'Hello World' and responded with 'Hello Human'");
                    break;
                case (3):
                    tallyThree +=1;    
                    System.out.println("It's going to rain");
                    break;
                case (4):
                    tallyFour +=1;    
                    System.out.println("The muppests are running for President");    
                    break;
                case (5):
                    tallyFive +=1;    
                    System.out.println("Try again");    
                    break;
                case (6):
                    tallySix +=1;    
                    System.out.println("Ask again later");    
                    break;
                case (7):
                    tallySeven +=1;
                    System.out.println("Busy eating pizza");
                    break;
                case (8):
                    tallyEight +=1;    
                    System.out.println("You will find great riches... if code bugs were riches");    
                    break;
                case (9):
                    tallyNine +=1;    
                    System.out.println("Have you fixed the bugs yet?");    
                    break;
                case (10):
                    tallyTen +=1;    
                    System.out.println("Ask again when the bugs are all gone"); 
                    break;
                default:
                    System.out.println("Somehow you broke it, not sure how");
            }
        }
        System.out.println("The tally of 1 is " + tallyOne);
        System.out.println("The tally of 2 is " + tallyTwo);
        System.out.println("The tally of 3 is " + tallyThree);
        System.out.println("The tally of 4 is " + tallyFour);
        System.out.println("The tally of 5 is " + tallyFive);
        System.out.println("The tally of 6 is " + tallySix);
        System.out.println("The tally of 7 is " + tallySeven);
        System.out.println("The tally of 8 is " + tallyEight);
        System.out.println("The tally of 9 is " + tallyNine);
        System.out.println("The tally of 10 is " + tallyTen);

    }

}