package basicPrograms;
import java.util.Scanner;

public class userInput {
	public static void main(String[]args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1: ");
		num1 = sc.nextInt();
		
		System.out.println("enter num2: ");
		num2 = sc.nextInt();
		System.out.println(num1 + "*" + num2 + "=" + num1*num2);
		
		
	}

}
