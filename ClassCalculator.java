import java.util.Scanner;

public class ClassCalculator{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter firstNumber");
		int firstNumber = input.nextInt();

		System.out.println("Enter secondNumber");
		int secondNumber = input.nextInt();

		System.out.println("Enter thirdNumber");
		int thirdNumber = input.nextInt();

		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.printf("sum is %d%n", sum);

		int product = firstNumber * secondNumber * thirdNumber;
		System.out.printf("product is %d%n", product);

		int average = sum / 3;
		System.out.printf("average is %d%n", average);

		int largest = 0;
		int smallest = firstNumber;

		if(firstNumber > largest){
		largest = firstNumber;
		}
		
		if(secondNumber > largest){
		largest = secondNumber;
		}

		if(thirdNumber > largest){
		largest = thirdNumber;
		}
		System.out.printf("Largest is %d%n", largest);
		
		if(secondNumber < smallest){
		smallest = secondNumber;
		}

		if(thirdNumber < smallest){
		smallest = thirdNumber;
		}
		System.out.printf("Smallest is %d%n", smallest);
	
	
	}
} 