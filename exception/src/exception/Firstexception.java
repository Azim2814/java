package exception;

import java.util.Scanner;

public class Firstexception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,result;
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		try {
			result = a/b;
			System.out.println("result is"+result);
		} catch (Exception e) {

			System.out.println("cannot divide by zero");
		}
	}
}
