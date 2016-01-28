//string most often

import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {

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
		
		int mostOften = 0;
		String frequent = null;
		int count = 0;
		
		for(int i = 0; i < list.size(); i++)
		{
			count = 0;
			for (int j = 0; j < list.size(); j++)
			{
				
				if(list.get(j).compareTo(list.get(i)) == 0)
				{
					count ++;
				}
			}
			
			if(mostOften < count)
			{
				mostOften = count;
				frequent = list.get(i);
			}
		}
		
		System.out.println("The most often occuring string is '" + frequent + "', it appears " + mostOften + " times.");
	}
}