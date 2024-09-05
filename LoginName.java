package LoginName;

import java.util.Scanner;

public class LoginName {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input = scnr.nextLine();
		String[] data = input.split(" ");
		
		if(data.length < 3){
		   System.out.println("Please input your information in the format: FirstName LastName YearBorn");   
		   scnr.close();
		   return;
		} 
		
        
		String firstName = data[0].length() >= 6 ? data[0].substring(0, 6) : data[0];
		
		String lastNameInitial = data[1].substring(0, 1);
		String year = data[2];
      
      System.out.println("Your login name: " + firstName + "" + lastNameInitial + "_" + year.charAt(data[2].length() - 1));
      
      scnr.close();
	}
}