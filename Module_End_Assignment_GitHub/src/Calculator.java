import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println("Enter the desired mathematical operator (+, -, *, /, %): ");
		char op = in.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println("Sum of the given numbers is "+(num1+num2));
			break;
			
		case '-':
			System.out.println("Sum of the given numbers is "+(num1-num2));
			break;
			
		case '*':
			System.out.println("Sum of the given numbers is "+(num1*num2));
			break;
			
		case '/':
			System.out.println("Sum of the given numbers is "+(num1/num2));
			break;
		
		case '%':
			System.out.println("Sum of the given numbers is "+(num1%num2));
			break;
			
		default:
			System.out.println("Please enter a valid operator!");

		}
		
		//System.out.println("New Push!");
	}

}
