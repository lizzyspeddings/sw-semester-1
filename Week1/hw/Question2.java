import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  in.nextLine();
        int t = 0;
        
        while(n > 0)
        {
            System.out.println("Please enter a number: ");
            int i = in.nextInt();  in.nextLine();
            
            if(n < i)
            {
                t = n;
            }
            else
            {
                t = i;
            }
        }
        
        System.out.println("The smallest number you printed was " + t + ".");
    }
}
