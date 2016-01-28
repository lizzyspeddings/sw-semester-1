import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a string: ");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		char x = word.charAt(0);
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) < x){
				x = word.charAt(i);
			}
			else {
				x = x;
			}
		}
		System.out.println("The first character alphabetically is " + x + ".");
	}

}
