import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Tutor {

	String tutorName;
	String tutorSurname;
	String tutorId;
	String tutorPassword;
	String contactNum;
	String email;
	String address;
	
	String info;
	
	Scanner input = new Scanner(System.in);
	
	Course course = new Course();
	Student student = new Student();
	CourseCalender calender = new CourseCalender();
	
	File tutorFile = new File("C:/eclipse/Workspace/UMSFiling/src/Tutor.txt");
	File temp = new File("C:/eclipse/Workspace/UMSFiling/src/temp.txt");
	
	Tutor(){
		//Empty Constructor
	}

	Tutor(String tutorName,String tutorSurname, String tutorId, String tutorPassword, String contactNum, String email, String address){
	
		this.tutorName = tutorName;
		this.tutorSurname = tutorSurname;
		this.tutorId = tutorId;
		this.tutorPassword = tutorPassword;
		this.contactNum = contactNum;
		this.email = email;
		this.address = address;
	}
	
	void viewTutorInfo(){

		try(Scanner in = new Scanner(tutorFile)){
			while(in.hasNextLine()){
				String id = in.next();
				String name = in.next().trim();
				String surname = in.next().trim();
				@SuppressWarnings("unused")
				String pass = in.next().trim();
				String cnum = in.next().trim();
				String mail = in.next().trim();
				String add = in.nextLine();
				
				System.out.println("Tutor ID: " + id);
				System.out.println("Tutor Name: " + name);
				System.out.println("Tutor Surname: " + surname);
				System.out.println("Tutor Contact Number: " + cnum);
				System.out.println("Tutor Email Adrress: " + mail);
				System.out.println("Tutor Address: " + add);
				
				System.out.println("\n");
			}
		} catch(FileNotFoundException e){
			System.out.println("File Not Found!");
		}
	}
	
	void modifyTutorInfo(){
		
		System.out.print("Enter Tutor ID to modify his/her Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(tutorFile);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.next().trim();
			String surname =  in.next().trim();
			String pass = in.next().trim();
			String cnum = in.next().trim();
			String mail = in.next().trim();
			String add = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				System.out.println("Enter Tutor ID: ");
				tutorId = input.nextLine();
				
				System.out.println("Enter Tutor Name: ");
				tutorName = input.nextLine();
				
				System.out.println("Enter Tutor SurName: ");
				tutorSurname = input.nextLine();
				
				System.out.println("Enter Tutor Password: ");
				tutorPassword = input.nextLine();
				
				System.out.println("Enter Tutor Contact Number: ");
				contactNum = input.nextLine();
				
				System.out.println("Enter Tutor Email Address: ");
				email = input.nextLine();
				
				System.out.println("Enter Tutor Address: ");
				address = input.nextLine();
				
				write.println(tutorId + " " + tutorName + " " + tutorSurname + " " + tutorPassword + " " + contactNum + " " + email + " " + address);
				flag = 1;
				System.out.println("Tutor Record Modification completed.");
			} else{
				write.println(id + " " + name + " " + surname + " " + pass + " " + cnum + " " + mail + " " + add);
			}
		}

		if (flag == 0){
			System.out.println("The Tutor record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
		
		
		try {
			Scanner in = new Scanner(temp);
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(tutorFile, false)));
			
			while(in.hasNextLine()){
				write.println(in.nextLine());
				}
			write.close();
			in.close();
			
			} catch (IOException e1) {
				System.out.println("File Not Found!");
			}

	}
	
	void renameTutor(){
		System.out.print("Enter Tutor ID to rename his/her Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(tutorFile);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.next().trim();
			String surname =  in.next().trim();
			String pass = in.next().trim();
			String cnum = in.next().trim();
			String mail = in.next().trim();
			String add = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				System.out.println("Enter Tutor Name to rename: ");
				tutorName = input.nextLine();
				
				System.out.println("Enter Tutor SurName to rename: ");
				tutorSurname = input.nextLine();
				
				write.println(id + " " + tutorName +  " " + tutorSurname + " " + pass +" " + cnum + " " + mail + " " + add);
				flag = 1;
				System.out.println("Tutor Renamed successfully.");
			} else{
				write.println(id + " " + name + " " + surname + " " + pass +" " + cnum + " " + mail + " " + add);
			}
		}

		if (flag == 0){
			System.out.println("The Tutor record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
		
		
		try {
			Scanner in = new Scanner(temp);
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(tutorFile, false)));
			
			while(in.hasNextLine()){
				write.println(in.nextLine());
				}
			write.close();
			in.close();
			
			} catch (IOException e1) {
				System.out.println("File Not Found!");
			}

	}
	
	void createTutor(){
		
		System.out.println("Enter Tutor ID: ");
		tutorId = input.nextLine();
		
		System.out.println("Enter Tutor Name: ");
		tutorName = input.nextLine();
		
		System.out.println("Enter Tutor SurName: ");
		tutorSurname = input.nextLine();
		
		System.out.println("Enter Tutor Password: ");
		tutorPassword = input.nextLine();
		
		System.out.println("Enter Tutor Contact Number: ");
		contactNum = input.nextLine();
		
		System.out.println("Enter Tutor Email Address: ");
		email = input.nextLine();
		
		System.out.println("Enter Tutor Address: ");
		address = input.nextLine();
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(tutorFile, true)))){
			out.println(tutorId + " " + tutorName + " " + tutorSurname + " " + tutorPassword + " " + contactNum + " " + email + " " + address);
		} catch(IOException e){
			System.out.println("File Not Found!");
		}

		System.out.println("Tutor Record Created.");

	}

	void viewCourse() {
		course.viewCourse();
	}

	void manageStudent() {
		System.out.println("Welcome to Student Management\n");
		System.out.println("Press 1 to create a Student Info");
		System.out.println("Press 2 to modify a Student Info");
		System.out.println("Press 3 to delete a Student Info");
		System.out.println("Press 4 to view a Student Info");
		System.out.println("Press 5 to view all Students Info");
		System.out.println("Press 6 to return to Main Menu");
		
		try{
		int choice = input.nextInt();
		
		if(choice == 1){
			student.createStudent();
		}
		
		else if (choice == 2){
			student.modifyStudentInfo();
		}
		
		else if (choice == 3){
			student.deleteStudentInfo();
		}
		
		else if (choice == 4){
			student.viewStudentInfo();
		}
		
		else if (choice == 5){
			student.viewAllStudent();
		}
		
		else if (choice == 6){
			//menu();
			return;
		}
		
		else{
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch (InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			manageStudent();
		}
	}
	
	void viewCourseCalender(){
		calender.viewCourseCalender();
	}
	
	void menu(){
		
		boolean variable = true;
		while(variable){
			
		System.out.println("Welcome to Main Menu!\n");
		System.out.println("Please Select a choice from the following: \n");
		System.out.println("Press 1 to View All Courses");
		System.out.println("Press 2 to View Tutors Info");
		System.out.println("Press 3 to Student Management");
		System.out.println("Press 4 to View Course Schedule");
		System.out.println("Press 5 to Sign Out");
		
		try {
		int choice = input.nextInt();
		
		if (choice == 1){
			viewCourse();
		}
		
		else if (choice == 2){
			viewTutorInfo();
		}
		
		else if (choice == 3){
			manageStudent();
		}
		
		else if (choice == 4){
			viewCourseCalender();
		}
		
		else if (choice == 5){
			System.out.println("Signing Out!\n\n");
			return;
		}
		
		else {
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch(InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			menu();
		}
	}
}
}
