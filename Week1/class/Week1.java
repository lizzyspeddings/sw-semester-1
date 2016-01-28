/*
REMEMBER TO PUT A ";" AT THE END OF A LINE!
mkdir = make directory
pwd = present working directory
cd = change directory
ls = list elements in pwd
Class names should ALWAYS begin with a capital letter
"public" means that code can be accessed outside this file
compile - turning java (for example) into "computer language"
Flow of Control = The order in which the computer reads the program
*/

import java.util.Scanner;
public class Week1
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");		/*print a statement*/
		System.out.println("What is your name?: ");

		Scanner in = new Scanner(System.in);	/*scanner is a type of class allows you to read values of various types*/
		String name = in.nextLine();		/*define a string and assign whatever is typed on the next line to it*/
		System.out.println("Hello " + name);

		System.out.println("What's your favourite colour?: ");
		String colour = in.nextLine();
		System.out.println("I dont like the colour " + colour + ".");

		int x = name.length();		/*define an integer*/
		char c = name.charAt(0); 	/*assigns the letter at position 0 to the "char"acter variable c*/
		System.out.println("Your name has " + x + " letters and begins with a " + c + ".");

		int y = colour.length();
		char d = colour.charAt(y-1);	/*the length of a word -1 is the last letter*/
		System.out.println("The colour " + colour + " has " + y + " letters and ends with a " + d + ".");

		System.out.println("What is your age?: ");
		int age = in.nextInt();	in.nextLine();	/*when you are taking an integer value for your input you must do a nextLine()*/
		System.out.println("You are " + age + " years old.");

		int yrs10 = age - 10;		/* same operators (- + * /)  */
		System.out.println("10 years ago you would have been " + yrs10 + " years old.");
		int nextyr = age + 1;
		System.out.println("Next year you will be " + nextyr + " years old.");

		if(age < 25)		/*basic if/else statement*/
		{
			System.out.println("You're young.");
		}
		else
		{
			System.out.println("You're old.");
		}

		if(name.length() > 7)
		{
			System.out.println("Your name is long!");	
		}
		else
		{
			System.out.println("You have quite a short name.");

		}

		System.out.println("Enter a number: ");
		int rndmvar = in.nextInt();	in.nextLine();
		
		if(rndmvar < 10)
		{
			System.out.println("Your number is less than 10!");	
		}
		else
		{
			System.out.println("Your number is greater than 10!");

		}

		System.out.println("Enter some text: ");
		String input = in.nextLine();
		while(input.length() > 0)		/*basic while loop*/
		{
			input = in.nextLine();
		}

		System.out.println("Enter a number: ");
		int num = in.nextInt();	in.nextLine();
		int total = 0;
		while(num > -1)
		{
			total = num + total;		/*you can also write total += num to get the same thing*/
			num = in.nextInt();	in.nextLine();
					
		}
		System.out.println("The total of all your numbers was " + total + ".");

		int start = 1;
		while(start <=10)
		{
			System.out.println(start);
			start = start +1;	/*you can just write start++;*/
		}
		
		for(int i = 1; i <= 10; i++)	/*this does exactly the same as the while loop above but its better because it puts all info about loop in one line*/
		{
			System.out.println(i);	
		}
		
		for(int i =10; i > 0; i--)
		{
			System.out.println(i);
		}		

	}

}
