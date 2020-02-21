 import java.util.Scanner;
public class Assignment19{

public static void main(String... args){
	System.out.println("Enter fist number");
		Scanner input = new Scanner(System.in);
	int firstNumber = input.nextInt();
		
	
	if(firstNumber%2 == 0){
	System.out.printf("even number %d%n", firstNumber);
	}
	
	if (firstNumber%2 != 0){
	System.out.printf("odd number %d%n", firstNumber);
	}
	
	}
}