import java.util.Scanner;
public class Assignment25{
	public static void main(String[] args){
	System.out.println("Enter first number");
	Scanner input = new Scanner(System.in);

		int firstNumber = input.nextInt();
	int square = firstNumber * firstNumber;
		System.out.printf("square %d%n", square);
	
	int cube = firstNumber * firstNumber * firstNumber;
		System.out.printf("cube %d%n", cube);
}
}