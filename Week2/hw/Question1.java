import java.util.Scanner;
import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter a string (enter stop to finish)");
		String s = in.nextLine();
		
		while(!s.equals("stop"))
		{
			list.add(s);
			System.out.println("Enter a string (enter stop to finish)");
			s = in.nextLine();
		}
		
		String x = list.get(0);
		
		for(int i = 0; i < list.size(); i++) 
		{
			String y = list.get(i);
			if (y.length() > x.length())
			{
				x = y;
			}
			else
			{
				break;
			}
		}
		
		System.out.println("The longest string in the list was " + x + ".");
	}
}