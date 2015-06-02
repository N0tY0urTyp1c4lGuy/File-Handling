package careerCup;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/*
 		Author	: Christian Balderrama
 		Email	: N0tY0urTyp1c4lGuy@gmail.com
 		Date	: June 2, 2014
 		Twitter	: @DevSlashXtian
 		Facebook: /christian.balderrama.71
*/
public class apples {
	
	private static Formatter x;
	private static File fileChecker;
	private static Scanner console;
	private static createFile create;
	private static readFile reader;
	
	public static void main(String[] args) {
		
//		Instantiate the console which is the Scanner.
		console = new Scanner(System.in);
		String firstName="",lastName="";
		String checker="";
		int counter = 0;
		
		try{
			fileChecker = new File("newFile5.txt");
//			Checking if the file exist
			if(!(fileChecker.exists())){

//				Instantiating the create object to the createFile and reader class to properly access other methods and creating a new file.
				create = new createFile();
				reader = new readFile();
				create.createFile("newFile.txt");

//				Loop that will iterate if the user wants to continue adding user.
				do{
					System.out.print("Enter first name: ");
					firstName = console.nextLine();
					System.out.print("Enter last name: ");
					lastName = console.nextLine();
					
//				Method in the createFile class that will write the firstName and lastName to the text file.
					create.writeFile(firstName, lastName);
					
					System.out.print("Do you want to continue? [Y/N]: ");
					checker = console.nextLine();
				}while(!(checker.equalsIgnoreCase("N")));

//				Properly closing the file created.
				create.closeFile();
				System.out.println("File created success!");
				
//				readFile method is called to read the file and transferring the textFile name inside the parameters. 	
				reader.readFile("newFile.txt");
				reader.closeFile();
			}
			else{
				System.out.println("Error file is already existing.");
			}
			
		}catch(Exception e){
			System.out.println("Error occured.");
		}
	}
}