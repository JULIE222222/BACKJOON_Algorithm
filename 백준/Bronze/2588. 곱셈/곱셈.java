import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		Long num1 = sc.nextLong();
		Long num2 = sc.nextLong();
	
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 / 10) % 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
				
	}

}