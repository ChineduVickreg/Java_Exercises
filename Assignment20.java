import java.util.Scanner;
public class Assignment20{
	
	public static void main(String[] args){
		System.out.println("Enter first number");
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second number");
		int secondNumber = input.nextInt();
		
		
		if(firstNumber % secondNumber == 0){
			System.out.printf("%d%n is a multiply of the firstNumber", firstNumber);
		}
		if(firstNumber % secondNumber != 0){
			System.out.printf("%d%n is a multiple of the firstNumber", firstNumber);
		}
	}
}










