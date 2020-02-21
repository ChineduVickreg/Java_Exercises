import java.util.Scanner;
public class ComparisonOfNumber{

	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
	System.out.println("Enter firstNumber");
		int firstNumber = input.nextInt();
	System.out.println("Enter secondNumber");
		int secondNumber = input.nextInt();
	if (firstNumber > secondNumber){
		System.out.println(firstNumber);
	}
	if (firstNumber < secondNumber){
		System.out.println(secondNumber);
	}
	}
}