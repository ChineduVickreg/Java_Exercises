import java.util.*;
public class PlayString{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = input.nextLine();
		System.out.println(text +" has "+ text.length() + " characters");
		System.out.println("The first character is "+ text.charAt(0));
		System.out.println("The last character is "+ text.charAt(text.length()-1));
	}

}