import java.util.Scanner;
/** switch cases functions to compare the user enter items and generated items ()*/
public class itemEnter extends items {
	
	// variable for loop to get repeated order after one is finished.
	static int nextOrder = 0; 
	
	//variable for Problem message
	String problemMgs = " \nEnter 1 for missing\n      2 for damage\n      3 for oversize";
	
	//scanner to replace a box if existing box is too small or large
	Scanner newUsedBox = new Scanner(System.in);
	
	/***Function to display for problem message**/////////////
	public void missing() {
		System.out.println("Move item to problem Solve and continue to next order\n"
		 		+ "---------------------------------");
		int nextOrder=0;
	}
	
	public void orderComplete() {
		System.out.println("Order complete! Please continue to next order");
		System.out.println("-------------------------------");
		int nextOrder =0;
	}
	
	public void changeBox() {
		System.out.println("Enter New box:");
		items.boxUse = newUsedBox.nextLine();
		int nextOrder=1;
		System.out.println("Enter the item: "+ item1);
	}
	/**********************************************************************/
	
	/**** Switch cases functions**/
	/************************************************************ switch case 1 starts  **/
	public void itemCase1() {
		
		System.out.println("Enter the item: " +item1+ problemMgs);
		
		
		
		//initial value of user input first item
		int userItem1 =0;
		
		// loop if user input wrong item
		while (userItem1 != item1) {
			
			Scanner userItemInput = new Scanner(System.in);
			userItem1 = userItemInput.nextInt();
			
			if (userItem1== item1) {
				orderComplete();
				
			}else if (userItem1==1 || userItem1==2){
				missing();
				break;
				
			}else if (userItem1==3){
				changeBox();
			
			}else {
				System.out.println("Enter correct item :" + item1);
			}
		}
	}
	/********************************************************** switch case 1 ends  **/
	
	/********************************************************** switch case 2 starts**/
	public void itemCase2() {
		System.out.println("enter the item: " +item1+ problemMgs);
		
		Scanner userItemInput = new Scanner(System.in);
		int userItem2_1 =0;
		
		while (userItem2_1 != item1) {
			userItem2_1 = userItemInput.nextInt();
			if (userItem2_1== item1) {
				
				/********************item2 starts *********/
				System.out.println("enter the item: " +item2+ problemMgs);
							
				int userItem2_2 =0;
				
				while (userItem2_2 != item2) {
					userItem2_2 = userItemInput.nextInt();
					if (userItem2_2== item2) {
						orderComplete();
						
					}else if (userItem2_2==1 || userItem2_1==2){
						missing();
						break;
						
					}else if (userItem2_2==3){
						changeBox();
					
					}else {
						System.out.println("Enter correct item :" + item2+ problemMgs);
					}
				}
				/********************item2 ends *********/
				
			}else if (userItem2_1==1 || userItem2_1==2){
				missing();
				break;
				
			}else if (userItem2_1==3){
				changeBox();
			
			}else {
				System.out.println("Enter correct item :" + item1+ problemMgs);
			}
		}
	}
	/********************************************************** switch case 2 ends  **/
	
	/********************************************************** switch case 3 starts**/
	public void itemCase3() {
		System.out.println("enter the item: " +item1+ problemMgs);
		
		Scanner userItemInput3_1 = new Scanner(System.in);
		int userItem3_1 =0;
		
		while (userItem3_1 != item1) {
			userItem3_1 = userItemInput3_1.nextInt();
			
			if (userItem3_1== item1) {
				
				/********************item2 starts *********/
				System.out.println("enter the item: " +item2+ problemMgs);
				Scanner userItemInput3_2 = new Scanner(System.in);
				
				int userItem3_2 =0;
				
				while (userItem3_2 != item2) {
					userItem3_2 = userItemInput3_2.nextInt();
					
					if (userItem3_2== item2) {
						/********************item3 starts *********/
						System.out.println("enter the item: " +item3+ problemMgs);
						Scanner userItemInput3_3 = new Scanner(System.in);
						
						int userItem3_3 =0;
						
						while (userItem3_3 != item3) {
							
							userItem3_3 = userItemInput3_3.nextInt();
							if (userItem3_3== item3) {
								orderComplete();
								
							}else if (userItem3_3==1 || userItem3_3==2){
								missing();
								break;
								
							}else if (userItem3_3==3){
								changeBox();
							
							}else {
								System.out.println("Enter correct item :" + item3+ problemMgs);
							}
						}
						/********************item3 ends *********/
					}else if (userItem3_2==1 || userItem3_2==2){
						missing();
						break;
						
					}else if (userItem3_2==3){
						changeBox();
					
					}else {
						System.out.println("Enter correct item :" + item2+ problemMgs);
					}
				}
				/********************item2 ends *********/
				
			}else if (userItem3_1==1 || userItem3_1==2){
				missing();
				break;
				
			}else if (userItem3_1==3){
				changeBox();
			
			}else {
				System.out.println("Enter correct item :" + item1+ problemMgs);
			}
		}
	}
	/********************************************************** switch case 3 ends  **/
	
	/********************************************************** switch case 4 starts**/
	public void itemCase4() {
		System.out.println("enter the item: " +item1+ problemMgs);
		
		Scanner userItemInput = new Scanner(System.in);
		int userItem4_1 =0;
		
		while (userItem4_1 != item1) {
			
			userItem4_1 = userItemInput.nextInt();
			
			if (userItem4_1== item1) {
				
				/********************item2 starts *********/
				System.out.println("enter the item: " +item2+ problemMgs);
				
				int userItem4_2 =0;
				
				while (userItem4_2 != item2) {
					userItem4_2 = userItemInput.nextInt();
					if (userItem4_2== item2) {
						
						/********************item3 starts *********/
						System.out.println("enter the item: " +item3+ problemMgs);
						
						int userItem4_3 =0;
						
						while (userItem4_3 != item3) {
							userItem4_3 = userItemInput.nextInt();
							
							if (userItem4_3== item3) {
								
								/********************item4 ends *********/
								System.out.println("enter the item: " +item4+ problemMgs);
								
								int userItem4_4 =0;
								
								while (userItem4_4 != item4) {
									userItem4_4 = userItemInput.nextInt();
									if (userItem4_4== item4) {
										orderComplete();

									}else if (userItem4_4==1 || userItem4_4==2){
										missing();
										break;
										
									}else if (userItem4_4==3){
										changeBox();
									
									}else {
										System.out.println("Enter correct item :" + item3+ problemMgs);
									}
								}
								/********************item4 ends *********/

							}else if (userItem4_3==1 || userItem4_3==2){
								missing();
								break;
								
							}else if (userItem4_3==3){
								changeBox();
							
							}else {
								System.out.println("Enter correct item :" + item3+ problemMgs);
							}
						}
						/********************item3 ends *********/

					}else if (userItem4_2==1 || userItem4_2==2){
						missing();
						break;
						
					}else if (userItem4_2==3){
						changeBox();
					
					}else {
						System.out.println("Enter correct item :" + item2+ problemMgs);
					}
				}
				/********************item2 ends *********/
				
			}else if (userItem4_1==1 || userItem4_1==2){
				missing();
				break;
				
			}else if (userItem4_1==3){
				changeBox();
			
			}else {
				System.out.println("Enter correct item :" + item1+ problemMgs);
			}
		}
	}
	/********************************************************** switch case 4 ends  **/
}
