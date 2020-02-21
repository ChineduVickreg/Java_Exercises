import java.util.Scanner;
public class CompareCalculator{

	public static void main(String... args){
	System.out.println("Enter firstNumber");
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
	System.out.println("Enter secondNumber");
		int secondNumber = input.nextInt();
	System.out.println("Enter thirdNumber");
		int thirdNumber = input.nextInt();
		int largest = 0;
		int position = 0;
	if(firstNumber > largest){
		largest = firstNumber;
		position = 1;
		}
	if(secondNumber > largest){
		largest = secondNumber;
		position = 2;
		}
	if(thirdNumber > largest){
	 	largest = thirdNumber;
		position = 3;
		
		}
	System.out.printf("largest number is %d%n", largest);
	System.out.printf("at position %d%n", position);
	
	}
}