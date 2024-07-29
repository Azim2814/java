package firstprogram;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		int a , b;
		System.out.println("hello world");
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a");
		a = sc.nextInt();
		System.out.println("ente b");
		b = sc.nextInt();
		System.out.println("addition is: "+(a+b));
		System.out.println("subtraction is : "+(a-b));
		System.out.println("multiplication is :"+(a*b));
		System.out.println("division is :"+(a/b));
	}
}
