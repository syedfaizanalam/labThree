import java.util.Scanner;

public class labThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 100.");
		int num = 0;
		
		num = scnr.nextInt();
		
		if (!(num < 1 || num > 100)) {
		if (num % 2 == 1) {
			System.out.println(num + " is odd");
		} else if (num % 2 == 0 && num > 1 && num < 26){
			System.out.println("even and less than 25");
		} else if (num % 2 == 0 && num > 25 && num < 61) {
			System.out.println("Even");
		} else if (num % 2 == 0 && num > 60) {
			System.out.println(num + " is even");
		} else if (num % 2 == 1 && num > 60) {
			System.out.println(num + " is odd and over 60");
		}
		} else {
			System.out.println("Invalid entry");
		}
		
	}

}
