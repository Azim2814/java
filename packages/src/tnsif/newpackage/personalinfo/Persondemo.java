package tnsif.newpackage.personalinfo;

import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.countryinfo.State;

public class Persondemo {
	public static void main(String[] args) {
		
	double tax;
	
	Country c = new Country("india");
	State  s = new State("gujarat");
	Person p = new Person("azim",5000, c,s);
	
	System.out.println(p);
	
	if (p.getsalary() >=10000 && p.getsalary()<=15000) {
		tax = p.getsalary() * 0.10;
		System.out.println("tax is"+tax);
	}
	else if (p.getsalary() >= 5000 && p.getsalary()<10000) {
		tax = p.getsalary()*0.05;
		System.out.println("tax is"+tax);
	}
	}

	
	
}
