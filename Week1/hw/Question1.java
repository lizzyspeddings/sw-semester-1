import java.util.Scanner;

public class Question1
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();  in.nextLine();
        
        for(int i =0; i <= number; i = i + 2)
        {
            System.out.println(i);
        }    
    }
}
