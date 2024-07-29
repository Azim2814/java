package student;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int n;
		boolean flag=false;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		for(int i=2 ; i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
			else {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println("prime no "+n);
		}
		else {
			System.out.println("not a prime"+n);
		}
	}
}
