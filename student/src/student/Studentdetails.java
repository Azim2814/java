package student;

public class Studentdetails {
	
	    private String name;

	    // Constructor with default parameter "Unknown"
	    public Studentdetails() {
	        this.name = "Unknown";
	    }

	    // Constructor with parameterized name
	    public Studentdetails(String name) {
	        this.name = name;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        // Creating instances of Student class with and without names
	        Studentdetails student1 = new Studentdetails("Alice");
	        Studentdetails student2 = new Studentdetails();

	        // Printing the names of the students
	        System.out.println("Student 1 name: " + student1.getName());  // Output will be "Unknown"
	        System.out.println("Student 2 name: " + student2.getName());  // Output will be "Alice"
	    }
	}


