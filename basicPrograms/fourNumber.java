package basicPrograms;

import java.util.Scanner;

public class fourNumber {
	public static void main(String[]args) {
		int num1,num2,num3,num4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num1: ");
		num1 = sc.nextInt();
		
		System.out.println("enter num2: ");
		num2 = sc.nextInt();
		
		System.out.println("enter num3: ");
		num3 = sc.nextInt();
		
		System.out.println("enter num4: ");
		num4 = sc.nextInt();
		
		if(num1==num2 && num2==num3 && num3==num4) {
			System.out.println("numbers are equal");
		}else {
			System.out.println("numbers are not equal");
		}
	}
}
