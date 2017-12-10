import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Course {

	String courseName;
	String courseId;
	String line;
	String info;
	
	File file = new File("C:/eclipse/Workspace/UMSFiling/src/Course.txt");
	File temp = new File("C:/eclipse/Workspace/UMSFiling/src/temp.txt");
	
	Scanner input = new Scanner(System.in);

	Course() {
		// Empty Constructor
	}

	Course(String courseName, String courseId) {
		this.courseName = courseName;
		this.courseId = courseId;
	}

	void createCourse() {
		
		System.out.println("Enter Course Name: ");
		courseName = input.nextLine();
		System.out.println("Enter Course ID: ");
		courseId = input.nextLine();
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))){
			out.println(courseId + " " + courseName);
		} catch(IOException e){
			System.out.println("File Not Found!");
		}

		System.out.println("Course Created.");
	}

	void viewCourse() {
		System.out.println("ID \t\t COURSE NAME");
		
		try(Scanner in = new Scanner(file)){
			while(in.hasNextLine()){
				String id = in.next();
				String name = in.nextLine().trim();
				
				System.out.println(id + " \t " + name);
			}
		} catch(FileNotFoundException e){
			System.out.println("File Not Found!");
		}
	}

	void modifyCourse() {
		
		System.out.print("Enter Course ID to modify its Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(file);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				System.out.print("Enter Course Name to modify: ");
				String textName = input.nextLine();
				
				System.out.print("Enter Course ID to modify: ");
				String textId = input.nextLine();
				
				write.println(textId + " " + textName);
				flag = 1;
				System.out.println("Course Modification completed.");
			} else{
				write.println(id + name);
			}
		}

		if (flag == 0){
			System.out.println("The course record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
		
		
		try {
			Scanner in = new Scanner(temp);
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
			
			while(in.hasNextLine()){
				write.println(in.nextLine());
				}
			write.close();
			in.close();
			
			} catch (IOException e1) {
				System.out.println("File Not Found!");
			}


	}

	void renameCourse(){

		System.out.print("Enter Course ID to Rename its Name Information: ");
		this.info = input.nextLine();
		
		try {
		Scanner in = new Scanner(file);
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
		int flag = 0;
		
		while(in.hasNextLine()){
			String id = in.next();
			String name = in.nextLine();
			
			if(id.compareToIgnoreCase(info) == 0){
				
				System.out.print("Enter Course Name to modify: ");
				String text = input.nextLine();
				write.println(id + " " + text);
				flag = 1;
				System.out.println("Name Modification completed.");
			} else{
				write.println(id + name);
			}
		}

		if (flag == 0){
			System.out.println("The course record of the entered ID isn't available.");	
			}
		write.close();
		in.close();
		
		
		
		} catch (IOException e1) {
			System.out.println("File Not Found!");
		}
		
		
		try {
			Scanner in = new Scanner(temp);
			PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
			
			while(in.hasNextLine()){
				write.println(in.nextLine());
				}
			write.close();
			in.close();
			
			} catch (IOException e1) {
				System.out.println("File Not Found!");
			}

	}

}