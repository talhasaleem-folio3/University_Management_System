import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Student {

	String studentId;
	String studentName;
	String qualification;
	String contactNum;
	String email;
	String address;
	
	String info;
	
	File studentFile = new File("C:/eclipse/Workspace/UMSFiling/src/Student.txt");
	File temp = new File("C:/eclipse/Workspace/UMSFiling/src/temp.txt");
	
	Scanner input = new Scanner(System.in);
	
	Student(){
	}
	
	Student(String studentId, String studentName, String qualification, String contactNum, String email, String address){
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualification = qualification;
		this.contactNum = contactNum;
		this.email = email;
		this.address = address;
		
	}
	
	void viewStudentInfo(){

		System.out.print("Enter Student ID to view his/her Student Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(studentFile);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.next() + in.next().trim();
			String qual = in.next().trim();
			String cnum = in.next().trim();
			String mail = in.next().trim();
			String add = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				flag = 1;
				
				System.out.println("Student ID: " + id);
				System.out.println("Student Student Name: " + name);
				System.out.println("Student Qualification: " + qual);
				System.out.println("Student Contact Number: " + cnum);
				System.out.println("Student Email Adrress: " + mail);
				System.out.println("Student Address: " + add);

			}
		}

		if (flag == 0){
			System.out.println("The Student record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
	}
	
	void deleteStudentInfo(){
	
		System.out.print("Enter Student ID to Delete his/her Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(studentFile);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.next().trim();
			String qual = in.next().trim();
			String cnum = in.next().trim();
			String mail = in.next().trim();
			String add = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				flag = 1;
				System.out.println("Student Record Deleted.");
			} else{
				write.println(id + " " + name + " " + qual + " " + cnum + " " + mail + " " + add );
			}
		}

		if (flag == 0){
			System.out.println("The Student record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
		
		
		try {
			Scanner in = new Scanner(temp);
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(studentFile, false)));
			
			while(in.hasNextLine()){
				write.println(in.nextLine());
				}
			write.close();
			in.close();
			
			} catch (IOException e1) {
				System.out.println("File Not Found!");
			}

	}
	
	void modifyStudentInfo(){
		
		System.out.print("Enter Student ID to modify his/her Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(studentFile);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.next().trim();
			String qual = in.next().trim();
			String cnum = in.next().trim();
			String mail = in.next().trim();
			String add = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				System.out.print("Enter Student ID to modify: ");
				this.studentId = input.nextLine();
				
				System.out.print("\nEnter Student Name to modify: ");
				this.studentName = input.nextLine();
				
				System.out.print("\nEnter Student Qualification to modify: ");
				this.qualification = input.nextLine();
				
				System.out.print("\nEnter Student Contact Number to modify: ");
				this.contactNum = input.nextLine();
				
				System.out.print("\nEnter Student Email Address to modify: ");
				this.email = input.nextLine();
				
				System.out.print("\nEnter Student Address to modify: ");
				this.address = input.nextLine();
				
				write.println(studentId + " " + studentName + " " + qualification + " " + contactNum + " " + email + " " + address);
				flag = 1;
				System.out.println("Student Record Modification completed.");
			} else{
				write.println(id + " " + name + " " + qual +" " + cnum + " " + mail + " " + add);
			}
		}

		if (flag == 0){
			System.out.println("The Student record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
		
		
		try {
			Scanner in = new Scanner(temp);
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(studentFile, false)));
			
			while(in.hasNextLine()){
				write.println(in.nextLine());
				}
			write.close();
			in.close();
			
			} catch (IOException e1) {
				System.out.println("File Not Found!");
			}

	}
	
	void createStudent(){
		
		System.out.print("Enter Student ID: ");
		this.studentId = input.nextLine();
		
		System.out.print("\nEnter Student Name: ");
		this.studentName = input.nextLine();
		
		System.out.print("\nEnter Student Qualification: ");
		this.qualification = input.nextLine();
		
		System.out.print("\nEnter Student Contact Number: ");
		this.contactNum = input.nextLine();
		
		System.out.print("\nEnter Student Email Address: ");
		this.email = input.nextLine();
		
		System.out.print("\nEnter Student Address: ");
		this.address = input.nextLine();
	
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(studentFile, true)))){
			out.println(studentId + " " + studentName + " " + qualification + " " + contactNum + " " + email + " " + address);
		} catch(IOException e){
			System.out.println("File Not Found!");
		}

		System.out.println("Student Record Created.");

	}
	
	void viewAllStudent() {
		
		try(Scanner in = new Scanner(studentFile)){
			while(in.hasNextLine()){
				String id = in.next();
				String name = in.next() + in.next().trim();
				String qual = in.next().trim();
				String cnum = in.next().trim();
				String mail = in.next().trim();
				String add = in.nextLine();
				
				System.out.println("Student ID: " + id);
				System.out.println("Student Name: " + name);
				System.out.println("Student Qualification: " + qual);
				System.out.println("Student Contact Number: " + cnum);
				System.out.println("Student Email Adrress: " + mail);
				System.out.println("Student Address: " + add);
				
				System.out.println("\n");
			}
		} catch(FileNotFoundException e){
			System.out.println("File Not Found!");
		}
	
	}
}
