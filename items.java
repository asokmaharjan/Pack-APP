public class items {
	static int item1, item2, item3, item4, numberOfItem;
	
	 public static void itemG() {
		  item1 = (int) (Math.random()*(999999 -100000 +1) +1);
		  item2 = (int) (Math.random()*(999999 -100000 +1) +1);
		  item3 = (int) (Math.random()*(999999 -100000 +1) +1);
		  item4 = (int) (Math.random()*(999999 -100000 +1) +1);
		 
		  numberOfItem = (int) (Math.random()*(4-1+1)+1);
	 }
	  
	 static String boxUse = null;
	 
	 public static void showBox(){
			
			int boxSize = 0; //box size 
			
			/* switch case to determine the box size 
			 * according to number of items 			
			 */
			switch (numberOfItem) {
			case 1:
				boxSize = item1 % 10;
				break;
			
			case 2:
				boxSize = (item1 % 10) + (item2 % 10) ;
				break;
			
			case 3:
				boxSize = (item1 % 10) + (item2 % 10) + (item3 % 10);
				break;
			
			case 4:
				boxSize = (item1 % 10)+ (item2 % 10)+ (item3 % 10)+ (item4 % 10);
				break;
			}
			/********switch case for box size determination ends********************/
			
			/* Box name assignment according to size of box
			 * 
			 */
			if (boxSize <= 6) {
				boxUse = "A1";
				
			} else if (boxSize <= 5) {
				boxUse = "A2";
				
			} else if (boxSize <= 8) {
				boxUse = "A3";
				
			} else if (boxSize <= 14) {
				boxUse = "A4";
				
			}  	else if (boxSize <= 20) {
				boxUse = "A5";
				
			}  	else if (boxSize >= 20) {
				boxUse = "A6";
			}
			
			System.out.println();
			System.out.println("Enter box : "+ boxUse );
			System.out.println("---------------------------");
		}
	 
	 /*
	  * function for item display according to number of item
	  */
	 public static void show() {
			//generating random items
		 	itemG();
			
			System.out.println("Number of items : " + numberOfItem );
						
			switch (numberOfItem) {
			case 1:
				System.out.print("1) " + item1 );
				break;
			
			case 2:
				System.out.print("1) " + item1 + " ");
				System.out.print("2) " + item2 + " ");
				break;
			
			case 3:
				System.out.print("1) " + item1 + " ");
				System.out.print("2) " + item2 + " ");
				System.out.print("3) " + item3 + " ");
				break;
			
			case 4:
				System.out.print("1) " + item1 + " ");
				System.out.print("2) " + item2 + " ");
				System.out.print("3) " + item3 + " ");
				System.out.print("4) " + item4 + " ");
				break;
			}
		}
	 /* item display function ends*/
}