package fleetFiles;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		//GET INPUT FROM THE USER (CONSOLE)
				Scanner userInput = new Scanner(System.in);
				
				System.out.print("Please enter your first name: ");
				String firstname = (userInput.next());
				System.out.print("Please enter your last name: ");
				String lastname = (userInput.next());
				System.out.print("Thank you, " + firstname + " " + lastname + ".  Please enter the current local diesel price: ");
				double localFuelPrice = (userInput.nextDouble());
				String userName = (firstname+lastname);
				System.out.println(userName);
				
				
				userInput.close();
		//Operations launch = new Operations();

	}

}
