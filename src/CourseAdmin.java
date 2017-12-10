import java.util.InputMismatchException;
import java.util.Scanner;

public class CourseAdmin {

	String name = "Badar";
	String surname = "Sami";
	String password = "ubit-123";
	
	Student student = new Student();
	Tutor tutor = new Tutor();
	Course course = new Course();
	CourseCalender calender = new CourseCalender();
	
	Scanner input = new Scanner(System.in);
	
	CourseAdmin(){
		
	}

	CourseAdmin(String name, String surname, String password) {

		this.name = name;
		this.surname = surname;
		this.password = password;
	}

	void manageCourse() {
		System.out.println("Welcome to Course Management\n");
		System.out.println("Press 1 to create a course");
		System.out.println("Press 2 to modify a course");
		System.out.println("Press 3 to rename a course");
		System.out.println("Press 4 to return to Main Menu");
		
		try{
		int choice = input.nextInt();
		
		if(choice == 1){
			course.createCourse();
		}
		
		else if (choice == 2){
			course.modifyCourse();
		}
		
		else if (choice == 3){
			course.renameCourse();
		}
		
		else if (choice == 4){
//			menu();
			return;
		}
		
		else{
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch (InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			manageCourse();
		}
	}

	void viewCourse() {
		course.viewCourse();
		
	}

	void viewTutor() {
		tutor.viewTutorInfo();
	}

	void manageTutorInfo() {
		System.out.println("Welcome to Tutor Management\n");
		System.out.println("Press 1 to create a Tutor Info");
		System.out.println("Press 2 to modify a Tutor Info");
		System.out.println("Press 3 to rename a Tutor");
		System.out.println("Press 4 to return to Main Menu");
		
		try{
		int choice = input.nextInt();
		
		if(choice == 1){
			tutor.createTutor();
		}
		
		else if (choice == 2){
			tutor.modifyTutorInfo();
		}
		
		else if (choice == 3){
			tutor.renameTutor();
		}
		
		else if (choice == 4){
			menu();
		}
		
		else{
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch (InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			manageTutorInfo();
		}
	}

	void manageStudent() {
		System.out.println("Welcome to Student Management\n");
		System.out.println("Press 1 to create a Student Info");
		System.out.println("Press 2 to modify a Student Info");
		System.out.println("Press 3 to delete a Student Info");
		System.out.println("Press 4 to view a Student Info");
		System.out.println("Press 5 to return to Main Menu");
		
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
			menu();
		}
		
		else{
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch (InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			manageStudent();
		}
	}

	void viewStudent() {
		student.viewAllStudent();
	}
	
	void viewCourseCalender(){
		calender.viewCourseCalender();
	}

	void manageCourseCalender(){
		
		System.out.println("Welcome to Schedule Management\n");
		System.out.println("Press 1 to create a course schedule");
		System.out.println("Press 2 to modify a course schedule");
		System.out.println("Press 3 to delete a course schedule");
		System.out.println("Press 4 to return to Main Menu");
		
		try{
		int choice = input.nextInt();
		
		if(choice == 1){
			calender.createCourseCalender();
		}
		
		else if (choice == 2){
			calender.modifyCourseCalender();
		}
		
		else if (choice == 3){
			calender.deleteCourseCalender();
		}
		
		else if (choice == 4){
			menu();
		}
		
		else{
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch (InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			manageCourseCalender();
		}
	}

	void menu(){
		
		boolean variable = true;
		while(variable){
		System.out.println("Welcome to Main Menu!\n");
		System.out.println("Please Select a choice from the following: \n");
		System.out.println("Press 1 to Course Management");
		System.out.println("Press 2 to View a Course Info");
		System.out.println("Press 3 to Tutor Management");
		System.out.println("Press 4 to View a Tutor Info");
		System.out.println("Press 5 to Student Management");
		System.out.println("Press 6 to View a Student Info");
		System.out.println("Press 7 to Course Schedule Management");
		System.out.println("Press 8 to View Course Calender");
		System.out.println("Press 9 to Sign Out");
		
		try {
		int choice = input.nextInt();
		
		if (choice == 1){
			manageCourse();
		}
		
		else if (choice == 2){
			viewCourse();
		}
		
		else if (choice == 3){
			manageTutorInfo();
		}
		
		else if (choice == 4){
			viewTutor();
		}
		
		else if (choice == 5){
			manageStudent();
		}
		
		else if (choice == 6){
			viewStudent();
		}
		
		else if (choice == 7){
			manageCourseCalender();
		}
		
		else if (choice == 8){
			viewCourseCalender();
		}
		
		else if (choice == 9){
			System.out.println("Signing Out!\n\n");
			break;
		}
		
		else {
			System.out.println("You entered wrong input. Please try again.");
		}
		
		} catch(InputMismatchException e){
			System.out.println("You entered wrong input. Please try again.");
			//menu();
			return;
		}
	}
	}
}
