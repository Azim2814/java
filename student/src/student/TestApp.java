package student;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		int id;
		String name[];
		int rollno;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		name = sc.nextLine();
		sc.nextLine();
		System.out.println("enter rollno");
		rollno = sc.nextInt();
	}
}
