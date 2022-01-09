
import java.util.Scanner;

public class packApp extends items {

	public static void main(String[] args)  {
		
		while (itemEnter.nextOrder==0) { //while loop for continuing with new order
			items.show(); // function displays and generates list and number of items
			items.showBox();// function to generate box size
			String usedBox = items.boxUse; //variable for box to be used
			String userBox = " ";//variable for box enter by user
			
			// Creating object for switch case functions
			itemEnter itemList = new itemEnter();
			
			//scanner for user to input box
			@SuppressWarnings("resource")
			Scanner inputBox = new Scanner(System.in); 
			
			while  (!userBox.equals(usedBox)) { //loop if user put wrong box size
				
				//assigning user input box to new variable
				String userInputBox = inputBox.nextLine();
				
				//converting user input box to upper case
				userBox = userInputBox.toUpperCase();
				
				/* if user box is correct then switch case will be 
				 * trigger depending on the number of items
				 */
				if (userBox.equals(usedBox)) { 
					 
					switch (numberOfItem) {
					
					case 1:
						itemList.itemCase1();
						break;
						
					case 2:
						itemList.itemCase2();
						break;
						
					case 3:
						itemList.itemCase3();
						break;
						
					case 4:
						itemList.itemCase4();
						break;
					}
					 
				 } else {
				 	 System.out.println("Please enter Box : " + usedBox);
				 }
			}
		}
	}
}
