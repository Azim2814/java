package tnsif.newpackage.personalinfo;

import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.countryinfo.State;

public class Person {
	private String pname;
	private int salary;
	private Country c ;
	private State s;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Country getC() {
		return c;
	}
	public void setC(Country c) {
		this.c = c;
	}
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}

	public Person(String pname, int salary, Country c, State s) {
		super();
		this.pname = pname;
		this.salary = salary;
		this.c = c;
		this.s = s;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", salary=" + salary + ", c=" + c + ", s=" + s + "]";
	}


}
