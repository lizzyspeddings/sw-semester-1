import java.util.Scanner;
import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> newList = new ArrayList<String>();
		System.out.println("Enter a string (enter stop to finish)");
		String s = in.nextLine();
		
		while(!s.equals("stop"))
		{
			list.add(s);
			System.out.println("Enter a string (enter stop to finish)");
			s = in.nextLine();
		}

		for (int i = 0 ; i < list.size(); i++)
		{
			String x = list.get(i);
			if (newList.contains(x) == false)
			{
				newList.add(x);
			}
		}
		
		System.out.println(newList);
	}
}
