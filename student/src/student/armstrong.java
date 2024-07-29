package student;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		int num,temp=0,rem,num2;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a num");
		num = sc.nextInt();
		num2 = num;
		while(num>0) {
			rem = num %10;
			temp  = temp +(rem * rem * rem);
			num = num/10;
			
		}
		if(temp == num2) {
			System.out.println("an armstrong"+num2);
			}
		else {
			System.out.println("not an armstrong"+num2);
		}
	}
}
