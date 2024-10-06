import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.LinkedList; 
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		LinkedList<Student> students = new LinkedList<>(); 
		
		while (true) { 
			System.out.println("Add a student? (y/n)");
			String response = scnr.nextLine();
			
			if (response.equalsIgnoreCase("n")) { 
				break;
			}
			
			System.out.print("Enter Student's Name: ");
			String name = scnr.nextLine();
			
			System.out.print("Enter Student's Address: ");
			String address = scnr.nextLine();
			
			System.out.print("Enter Student's GPA: ");
			double gpa = scnr.nextDouble();
			
			scnr.nextLine();
			
			Student stu = new Student(gpa, name, address);
			students.add(stu);
		}
		
		scnr.close(); 
		
		Collections.sort(students);
		
		try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("C:\\Users\\Dallas\\Desktop\\Software Development\\Java\\Projects\\CSC372\\poop.txt"))) {
			for (Object stu : students) { 
				myWriter.write(stu.toString());
				myWriter.newLine();
			}
			System.out.println("Written to file successfully!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
