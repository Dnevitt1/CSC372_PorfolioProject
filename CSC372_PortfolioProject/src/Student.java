
public class Student implements Comparable<Student> {

	private String name, address;
	private Double gpa; 
	
	public Student(double gpa, String name, String address) { 
		this.gpa = gpa; 
		this.name = name; 
		this.address = address; 	
	}
	
	public double getGpa() {
        return gpa;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    
    public void setName(String name) { 
    	this.name = name;
    }
    public void setAddress(String address) { 
    	this.address = address;
    }
    public void setGpa(double gpa) { 
    	this.gpa = gpa;
    }
    
    @Override
	public String toString() { 
		return "Student name: " + this.name + ", Student address: " + this.address + ", Student GPA: " + this.gpa + "\n"; 
	}
    
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);  // Compare by name alphabetically
    }
    
}