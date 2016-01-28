import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = in.nextLine();
		String reverseWord = "";
		for(int i = 1; i <= word.length(); i++)
		{
			reverseWord += (word.charAt(word.length()-i));
		}
		System.out.println(reverseWord);
		
		boolean palindrome = true;
		int x = 0;
		while( x < word.length())
		{
			if(reverseWord.charAt(x) == word.charAt(x))
			{
				x++;
			}
			else
			{
				x = word.length() + 1;
				palindrome = false;
			}
			
		}
		if( palindrome == false)
		{
			System.out.println("This is not a palindrome.");
		}
		else
		{
			System.out.println("This is a palindrome.");
		}
	}

}
