//java API - look up

import java.util.Scanner;
import java.util.ArrayList;

public class Week2 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("goodbye".compareTo("hello"));	//if first comes before last returns "-1", equal = "0", after "+1"
		
		System.out.println("Please enter a string: ");
				
		String input = in.nextLine();
		
		ArrayList<String> list = new ArrayList<String>();	//<string> shows that the array list will contain strings
		
		while (!input.equals("stop")) 	//compare the input to whatever in brackets. ! shows "not equal" to part 
		{								//always use .equals for comparing strings
			list.add(input);
			input = in.nextLine();
		}	
		
		for( int i = list.size() - 1; i >= 0; i --) 
		{
			System.out.println(list.get(i));
		}
		
		String s = list.get(0);
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).compareTo(s) < 0) 	//compar elements in the list
			{
				s = list.get(i);
			}
		}
		
		System.out.println("The first word alphabetically is " + s + ".");
		
		int count = 0;
		
		for (int i = 0; i < list.size(); i ++)	//how many times does an element appear in a list
		{
			if (list.get(i).equals("apple"))
			{
				count ++;
			}
			
			else
			{
				break;
			}
		}
		
		System.out.println("The word apple appears in the list " + count + " times.");

		if (list.contains("banana"))	//does the list contain a specific element
		{
			System.out.println("This list contains the string banana.");
		}
		
		else
		{
			System.out.println("This list doesn't contain the string banana.");
		}
		
		int n = list.indexOf("peach");		//if there is no element peach in the list "-1" is returned
						
		System.out.println("Peach is at the index " + n + ".");		//if more than one peach it only lists first one
		
		System.out.println("Removing item 1");	//trying to remove an item that doesn't exist in list produces error
		
		list.remove(1);
		
		list.remove("banana");		//only removes one item even if there are more in the list
									//doesn't remove anything if there are no items in the list
		System.out.println(list);
		
		
		
		
	}

}