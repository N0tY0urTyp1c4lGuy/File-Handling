package careerCup;

import java.util.Formatter;

public class createFile {
	
	private Formatter create;
	
	public void createFile(String fileName){
		
		try{
			
//			Creating a new file and fileName is based on the parameter passed when called.			
			create = new Formatter(fileName);
		}catch(Exception e){
			System.out.println("Error occured.");
		}
	}
	
	public void writeFile(String firstName, String lastName){
//		Writing things to the text file with a String, String format.
		create.format("%s %s\n", firstName,lastName);
	}
	
	public void closeFile(){
//		Properly closing the file.
		create.close();
	}
}