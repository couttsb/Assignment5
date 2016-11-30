package assignment5;

import java.util.Scanner;

public class Ass5 {

	public int doStuff(int number1thatdoesstuff) {
		
		try(Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number1thatdoesstuff: ");
			number1thatdoesstuff = input.nextInt();
		}
		
		int number2thatdoesstuff = 1;
		if (number1thatdoesstuff < 2) {
			return number1thatdoesstuff;
		}
		
		int number3thatdoesstuff = 1;
		for (int i = 2; i < number1thatdoesstuff; i++) {
			int number4thatdoesstuff = number2thatdoesstuff;
			number2thatdoesstuff += number3thatdoesstuff;
			number3thatdoesstuff = number4thatdoesstuff;
		}
		return number2thatdoesstuff;
	}
}
