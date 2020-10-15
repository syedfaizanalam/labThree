import java.util.Scanner;

public class labThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if odd => number "is odd" 
		//if even 2-24 => number "is even and less than 25"
		
		
		//if even 25-100 => number "is even"
		//if odd 60+ => number "is odd and over 60"
		
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scnr.nextLine();
		
		System.out.println("What is your gender? [m/f]");
		String gender = scnr.next();
		
		String title;
		
		if (gender.equals("m")) {
			title = "Mr.";
		} else {
			title = "Ms.";
		}
		
		System.out.println("Please, enter a number between 1 and 100," + " " + title + " " + name + ".");
		int num = 0;
		
		num = scnr.nextInt();
		
		if (!(num < 1 || num > 100)) {
		if (num < 60 && num % 2 == 1) {
			System.out.println(title + " " + name + ", " + num + " is odd.");
		} else if (num % 2 == 0 && num > 1 && num < 26){
			System.out.println(title + " " + name + ", " + num + " is even and less than 25.");
		} else if (num % 2 == 0 && num > 25 && num < 61) {
			System.out.println(title + " " + name + ", " + num + " is even.");
		} else if (num % 2 == 0 && num > 60) {
			System.out.println(title + " " + name + ", " + num + " is even.");
		} else if (num > 60 && num % 2 == 1) {
			System.out.println(title + " " + name + ", " + num + " is odd and over 60.");
		}
		} else {
			System.out.println(title + " " + name + ", " + "that is an invalid entry.");
		}
		
	}

}
