import java.util.Scanner;
{
public class GuessAccountNumber
{
    public static void main(String[] args) 
    {
        final int pin = 1234;
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(count < 3) 
        {
            int checkPin = sc.nextInt();
            count++;
            if (checkPin == pin) 
            {
                System.out.println("Correct, Welcome back.");
                break;
            } 
            else if (checkPin != pin) 
            {
                if (count < 3) 
                {
                    System.out.println("Incorrect, try_again.");
                } 
                else 
                {
                    System.out.println("Sorry but you have been locked out");
                }
            }
        }
    }
}
}
