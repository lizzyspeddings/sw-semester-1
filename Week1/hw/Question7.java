import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	in.nextLine();
		boolean prime = true;
		while(n <= 0) {
			System.out.println("Please enter a positive value: ");
			n = in.nextInt();	in.nextLine();
		}
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0 ){
				prime = false;
			}
			else {
				break;
			}
		}
		
		if(prime == false) {
			System.out.println("This number is not a prime.");
		}
		else {
			System.out.println("This number is a prime.");
		}
	}

}
