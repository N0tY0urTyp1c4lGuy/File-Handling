package careerCup;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class readFile {
	
	private Formatter reader;
	private File file;
	private Scanner console;
	
	public void readFile(String fileName){
		
		try{

//		Making console (variable) to be a Scanner that will scan the file based on the fileName passed on the parameter.
		console = new Scanner(new File(fileName));
		}catch(Exception e){
			System.out.println("File "+fileName+" does not exist.");
		}

//		Loop that will iterate while there's still something data to read.
		while(console.hasNext()){
			String firstName, lastName;

//		Variables is assigned to how many Strings it will read.			
			firstName = console.next();
			lastName = console.next();

//		Printing out the firstName and lastName according to the first parameter saying that String,String data types.
			System.out.printf("%s %s\n", firstName,lastName);
		}
	}
	
	public void closeFile(){
//	Properly closing the file.
		console.close();
	}
}