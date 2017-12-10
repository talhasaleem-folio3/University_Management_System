import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SignIn {
	
	Scanner input = new Scanner(System.in);
	
	CourseAdmin admin = new CourseAdmin();
	Tutor tutor = new Tutor();
	
	SignIn(){
		
		checkUp();
	}
	
	@SuppressWarnings("unused")
	void checkUp(){
		
		System.out.println("* WELCOME TO UNIVERSITY MANAGEMENT SYSTEM *");
		System.out.println("================================================");
		
//		for(long i=0; i<100000000; i++){
//			;
//		}
		
		System.out.println("Press Enter to continue.");
		input.nextLine();
		
		String tutName;
		String tutSurname;
		String tutPassword;
		
		
		Boolean flag = true;
	ABC:	
		while (flag){
		
		System.out.println("Please SignIn to continue!\n");
		
		System.out.println("Enter Name: ");
		String name = input.nextLine();
		
		System.out.println("Enter Surname: ");
		String surname = input.nextLine();
		
		System.out.println("Enter Password: ");
		String password = input.nextLine();
		
		File tutorFile = new File("C:/eclipse/Workspace/UMSFiling/src/Tutor.txt");
		try {
			Scanner in = new Scanner(tutorFile);
			
			while (in.hasNextLine()){
				String id = in.next();
				tutName = in.next().trim();
				tutSurname = in.next().trim();
				tutPassword = in.next().trim();
				String cnum = in.next().trim();
				String mail = in.next().trim();
				String add = in.nextLine();
				
				if(tutName.equalsIgnoreCase(name) && tutSurname.equalsIgnoreCase(surname) && tutPassword.equals(password)){
					tutor.menu();
					flag = false;
					
					System.out.println("PROJECT: UNIVERSITY MANAGEMENT SYSTEM");
					System.out.println("CREATED BY: TALHA SALEEM & MOHAMMAD OWAIS");
					break ABC;
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}
		
		if (admin.name.equalsIgnoreCase(name) && admin.surname.equalsIgnoreCase(surname) && admin.password.equals(password)){
			admin.menu();
			flag = false;
			
			System.out.println("PROJECT: UNIVERSITY MANAGEMENT SYSTEM");
			System.out.println("CREATED BY: TALHA SALEEM & MOHAMMAD OWAIS");
		}
//		else if (!admin.name.equalsIgnoreCase(name) && !admin.surname.equalsIgnoreCase(surname) && !admin.password.equals(password)){
		else{
			System.out.println("Invalid Details or Password.");
			System.out.println("Please Try Again");
		}
	}
	}
}
