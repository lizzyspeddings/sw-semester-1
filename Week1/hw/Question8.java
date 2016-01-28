import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	in.nextLine();
		boolean square = false;
		
		while(n <= 0) {
			System.out.println("Please enter a positive value: ");
			n = in.nextInt();	in.nextLine();
		}
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0 && i * i == n) {
				square = true;
				}
			else {
				square = square;
			}
		}

		if(square == true) {
			System.out.println("This is a square number.");
		}
		else {
			System.out.println("This is not a square number.");
		}
	}

}
