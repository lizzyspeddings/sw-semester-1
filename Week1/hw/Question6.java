import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
	    System.out.println("Please enter a string: ");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
	    char x = word.charAt(0);
		int originalLength = word.length();
		
		for(int j = 0; j < originalLength; j++) {
		    
		    String newWord = word;
		    int newLength = originalLength;
		    
		    for(int i = 0; i < newLength; i++) {
			    x = word.charAt(0);
			    if(word.charAt(i) < x){
				    x = word.charAt(i);
			    }
			    else {
				    x = x;
			    }
			    
			}
			newLength = newLength -1;
			System.out.println(x);
			word = word.substring(0, word.indexOf(x)) + word.substring(word.indexOf(x) +1, word.length()-1);
	    }
    }
}
		
