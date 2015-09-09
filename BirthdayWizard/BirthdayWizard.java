import java.util.Scanner;

public class BirthdayWizard {

	public static void main(String[] args) {
		System.out.println("Hello. Welcome to Birthday Wizard.");
		System.out.println("I can calculate when your 'n'th birthday will occur or has ");
		System.out.println("occured given your birth year and a numerical value for 'n.' ");
		System.out.println("Please enter your birth year. ");
		Scanner scanner = new Scanner(System.in);
		int birthyear = scanner.nextInt();
		System.out.println("Next, enter 'n' to calculate the corresponding year. ");
		int age = scanner.nextInt();
		int year = (birthyear + age) ;
		System.out.println("You will turn " + age + " in " + year + ".");
		
	}

}
