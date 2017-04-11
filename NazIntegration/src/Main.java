import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Naz Vocal
		// a variable is a location in memory

		// Creates a Scanner object to read input from stdin.

		Scanner scan = new Scanner(System.in);

		// prompts user
		System.out.println("Welcome to my Integration project! Please enter your first name.");

		// wait for the user to type name
		String name = scan.nextLine();

		System.out.println("Hello " + name + ". What is your age?");

		int num = scan.nextInt();

		if (num >= 18) {
			System.out.println("Great! You are old enough to view my Integration project");
		} else {
			System.out.println("Sorry you are not old enough to view my Integration project");
		}
		System.out.println("\t");

		System.out.println("What number does Messi use?");

		int integer = scan.nextInt();
		switch (integer) {
		case 4:
			System.out.println("Nope");
			break;
		case 10:
			System.out.println("Correct!");
			break;
		case 23:
			System.out.println("Keep trying");
			break;
		default:
			System.out.println("Hint: Number is 1 - 10");
			break;
		}
		System.out.println("\t");

		// mathematical operations
		double fnum;
		double snum;
		double answer;

		System.out.println("Enter a number");
		fnum = scan.nextDouble();
		System.out.println("Enter a second number");
		snum = scan.nextDouble();
		answer = (fnum + snum);
		System.out.println("The sum of these 2 numbers equals " + answer);
		System.out.println("\t");

		// Integer division is division in which the remainder is discarded.
		// Use % to obtain the remainder of two values
		int big = 10;
		int small = 5;
		int result = big / small;
		System.out.println(result);
		System.out.println("\t");
		/*
		 * The eight primitive data types supported by the Java programming language
		 * are: byte:The byte data type is an 8-bit signed two's complement integer.
		 * It has a minimum value of -128 and a maximum value of 127 (inclusive).
		 * The byte data type can be useful for saving memory in large arrays, where
		 * the memory savings actually matters short: The short data type is a
		 * 16-bit signed two's complement integer. int: Use the Integer class to use
		 * int data type as an unsigned integer. long: The long data type is a
		 * 64-bit two's complement integer. Use this data type when you need a range
		 * of values wider than those provided by int. float:The float data type is
		 * a single-precision 32-bit IEEE 754 floating point. This data type should
		 * never be used for precise values, such as currency double: The double
		 * data type is a double-precision 64-bit IEEE 754 floating point. For
		 * decimal values, this data type is generally the default choice. As
		 * mentioned above, this data type should never be used for precise values,
		 * such as currency. boolean:The boolean data type has only two possible
		 * values: true and false. Use this data type for simple flags that track
		 * true/false conditions char:The char data type is a single 16-bit Unicode
		 * character.
		 */

		Person myPerson = new Person();
		myPerson.setName("Bob");
		myPerson.setAge(22);
		System.out.println("My name is " + myPerson.getName() + " " + "and I am " + myPerson.getAge()); // call
																																																		// &argument
		System.out.println("\t");
		// while loop
		int count = 0;
		while (count < 4) {
			System.out.println(count);
			count++;
		}
		System.out.println("\t");
		// for loop
		double amount;
		double principal = 10000;
		double rate = .01;

		for (int day = 1; day <= 10; day++) {

			amount = principal * Math.pow(1 + rate, day);
			System.out.println(day + "  " + amount);
			System.out.println("\t");
			
			int[] numbers = { 6, 99, 10, 22, 36, 47, 17, 56 };

			// Finds smallest number in the array
			int min = numbers[0];
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i] < min) {
					min = numbers[i];
				}
			}
			System.out.println("The smallest number in the array is " + min);

			// Finds index
			System.out.println("Enter a number that appears on the array list");
			int find = scan.nextInt();
			int indexOfFind = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (find == numbers[i]) {
					indexOfFind = i;
					break;
				}
			}
			System.out.println("The index of " + find + " is " + indexOfFind);
			System.out.println("\t");
			int sum = 0;
			for (int counter = 0; counter < numbers.length; counter++) {
				sum += numbers[counter];
			}
			System.out.println("The sum of these numbers equals: " + sum);
			System.out.println("\t");
			// conditional operator
			int age = 20;

			System.out.println(age > 50 ? "You are old" : "You are young");

		}
		scan.close();
	}
}
