package LoginName;

import java.util.Scanner;

public class LoginName {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
      
        String input = scnr.nextLine();
        String[] data = input.split(" ");

        System.out.println(data[0] + data[1].charAt(0) + "_" + data[data.length - 1].charAt(data.length));;
      
        scnr.close();
	}
}