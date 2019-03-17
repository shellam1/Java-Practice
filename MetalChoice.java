/****************************************************************************
* Project 3 - Chocices for Metal Art
****************************************************************************
* This program calculates the cost of building metal art structures.
*_____________________________________________________
* Asia Shell
* February 21, 2019
* CMSC 255 - Section 004
****************************************************************************/

import java.util.Scanner;

	public class MetalChoice
	{
	public static void main(String[] args)
	{
		System.out.println("Asia Shell");
 		System.out.println("Project 3 - Choices for Metal Art");
 		System.out.println("This project calculates and displays the cost of building metal art structures.");
 		System.out.println("February 21,2019");
 		System.out.println("CMSC 255 - Section 004");

 		/******************************
 		The Program will now initialize and assign the constants and variables that are being used to calculate cost throughout the whole program.
 		*********************************/
 		Scanner input = new Scanner(System.in);
 		Scanner a = new Scanner(System.in);
 		Scanner b = new Scanner(System.in);
 		Scanner c = new Scanner(System.in);
 		Scanner d = new Scanner(System.in);
 		Scanner sc = new Scanner(System.in);

 		final double TITANIUM_PRICE_PER_INCH = 4.50; 
 		final double STEEL_PRICE_PER_INCH = 2.85;
 		final double ALUMINUM_PRICE_PER_INCH = 1.50; 
 		final double BRONZE_PRICE = 8.00;
 		final double SILVER_PRICE = 12.50;
 		final double GOLD_PRICE = 19.99;

 		String guess = "quit";
 		String sculptureName;
 		int userSculptures;
 		int numberOfSculptures = 0;
 		double letterPrice = 0.00;
 		double sculptureTypePrice = 0.00;
 		double namePlateTypePrice = 0.00;
 		double namePlateCost = 0.00;
 		double totalPriceOfSculpture = 0.00;
 		double grandTotal = 0.00;
 		
 		/*****************************
 		The user will start the program by learning the command to exit the program, whiching
 		is "quit" and decide to continue using the program.
 		**********************************/
 		System.out.print("Press enter to continue shopping or type QUIT to see your grand total and exit program: ");
 		guess = input.nextLine();
 		while (!guess.equalsIgnoreCase ("quit")) {

 		/*********************************
 		The user will enter in their desired number of sculptures.
 		*********************************/
 		System.out.println();
 		System.out.print("Enter the number of metal art sculptures that you would like to create:");
 		userSculptures = a.nextInt();
 		for (numberOfSculptures = 0; numberOfSculptures < userSculptures; numberOfSculptures++) {

 		/***********************************************
		The first part of customization. The user will now choose their sculpture material and the 
		program will decide the price based on their desired types.
		*******************************************/
		System.out.println();
		System.out.println("Which type of material do you want your sculpture to be made of?");
		System.out.print("Please enter A for aluminum, S for steel, or T for titanium:");
		char typeSculpture = c.next().charAt(0);
		typeSculpture = Character.toUpperCase(typeSculpture);
		while (sculptureTypePrice == 0) {
			if (typeSculpture == 'A') {
				sculptureTypePrice += ALUMINUM_PRICE_PER_INCH;
			}
			else if (typeSculpture == 'S') {
				sculptureTypePrice += STEEL_PRICE_PER_INCH;
			}
			else if (typeSculpture == 'T') {
				sculptureTypePrice += TITANIUM_PRICE_PER_INCH;
			}
			else {
				System.out.println("Your entry could not be found. Please try again.");
				typeSculpture = c.next().charAt(0);
				typeSculpture = Character.toUpperCase(typeSculpture);
			}
		}

		/***************************************
		The second part of customization. The user will choose the material for their name plate and the 
		program will decide the price based on their desired types. 
		***************************************/
		System.out.println();
		System.out.println("Which type of material do you want your name plate to be made of?");
		System.out.print("Please enter B for bronze, S for silver, or G for gold:");
		char typeNamePlate = d.next().charAt(0);
		typeNamePlate = Character.toUpperCase(typeNamePlate);
		while (namePlateTypePrice == 0) {
			if (typeNamePlate == 'B') {
				namePlateTypePrice += BRONZE_PRICE;
			}
			else if (typeNamePlate == 'S') {
				namePlateTypePrice += SILVER_PRICE;
			}
			else if (typeNamePlate == 'G') {
				namePlateTypePrice += GOLD_PRICE;
			}
			else {
				System.out.println("Your entry could not be found. Please try again.");
				typeNamePlate = d.next().charAt(0);
				typeNamePlate = Character.toUpperCase(typeNamePlate);
			}
		}

 		/********************************
 		The third part of customization. The user will now enter the name of their sculpture which will be displayed on the sculpture's name plate and the program will 
 		decide the price of the name based on the number of letters entered by the user. This loop allows the user to recieve a name plaate discount.
 		*********************************/
 		System.out.println();
 		System.out.print("Enter the name of your sculpture, which will be displayed on its name plate: ");
		sculptureName = b.nextLine();
		while (letterPrice == 0 && namePlateCost == 0) {
			if (typeNamePlate == 'G' && sculptureName.length() > 10) {
				System.out.println("Congratulations! You get a discount of $2.00 on the cost of your name plate.");
				namePlateCost = namePlateCost - 2.00;
				letterPrice = letterPrice + 19.99 + ((sculptureName.length() - 5) * 1.85);
			}
			else if (sculptureName.length() == 5) {
				letterPrice = letterPrice + 19.99;
			}
			else if (6 <= sculptureName.length() && sculptureName.length() <= 10 ) {
				letterPrice = letterPrice + 19.99 + ((sculptureName.length() - 5) * 2.50);
			}
			else if (sculptureName.length() > 10) {
				letterPrice = letterPrice + 19.99 + ((sculptureName.length() - 5) * 1.85);
			}
			else {
				System.out.println("Your sculpture name must be at least 5 characters. Please try again.");
				sculptureName = b.nextLine();
			}

			namePlateCost += letterPrice + namePlateTypePrice;
}
		/**************
		The user will now enter the different measurements for calculating the
		several dimensions used to build their sculpture. 
		************/ 

		/****************
		Assign a whole number value to the length of one of the base sides on Pyramid 1 in inches 
		*****************/
		System.out.println();
		System.out.print("Enter the length of the base of the first pyramid (inches): ");
		int lengthBasePyramid1 = sc.nextInt();

		/*****************
		Assign a whole number value to the height of Pyramid 1 in inches
		******************/
		System.out.print("Enter the height of the first pyramid (inches): ");
		int heightPyramid1 = sc.nextInt();

		/**********************
		Assign a whole numbe value to the length of one of the base sides on Pyramid 2 in inches
		**********************/
		System.out.print("Enter the length of the base of the second pyramid (inches): ");
		int lengthBasePyramid2 = sc.nextInt();

		/**************************
		Assign a whole number value to the height of Pyramid 2 in inches
		***********************/
		System.out.print("Enter the height of the second pyramid (inches): ");
		int heightPyramid2 = sc.nextInt();

		/*********************
		Assign a whole number value to the height of the Rectangular Prism in inches
		**********************/
		System.out.print("Enter the height of the rectangular prism (inches): ");
		int heightRectPrism = sc.nextInt();

		/*********************
		Assign a whole number value to the length of the Rectangular Prism in inches
		**************************/
		System.out.print("Enter the length of the rectangular prism (inches): ");
		int lengthRectPrism = sc.nextInt();
		
		/********************** 
		Assign a whole number value to the width of the Rectangular Prism in inches
		************************/
		System.out.print("Enter the width of the rectangular prism (inches): ");
		int widthRectPrism = sc.nextInt();

		/*********************************
		The prgram will now go through each step of equations to calculate the several dimensions of the sculpture using the users measurements.
		***********************************/

		/***************
		1. Calculate the slant length of the first Pyramid by taking the sqaure root of half of 1/2 of Pyramid 1 Base's length squared plus its height sqaured 
		*********************/
		double slPyramid1 = Math.sqrt((Math.pow((0.5 * lengthBasePyramid1), 2.0)) + (Math.pow(heightPyramid1, 2.0)));

		/**************************
		2. Calculate the area of the base of the first pyramid by taking 1/2 of the base's length times the sqaure 
		root of the base's length sqaured minus the sqaure root of half of 1/2 of Pyramid 1 Base's length squared
		*************************/
		double abPyramid1 = 0.5 * lengthBasePyramid1 * Math.sqrt(Math.pow(lengthBasePyramid1, 2.0) - Math.pow((0.5 * lengthBasePyramid1), 2.0));

		/************************
		3. Calculate the Surface area of Pyramid 1 by adding the pyramid 1 base's area to 1/2 of 3 times the base's length times the slant length
		***********************/
		double saPyramid1 = abPyramid1 + (0.5 * (3.0 * lengthBasePyramid1 * slPyramid1));

		/****************
		4. Calculate pyramid 2's slant length by taking the sqaure root of half of 1/2 of Pyramid 2 Base's length squared plus its height sqaured 
		*********************/
		double slPyramid2 = Math.sqrt((Math.pow((0.5 * lengthBasePyramid2), 2.0)) + (Math.pow(heightPyramid2, 2.0)));

		/*******************
		5. Calculate pyramid 2 base's area by taking 1/2 of the base's length times the sqaure root of
		the base's length sqaured minus the sqaure root of half of 1/2 of Pyramid 2 Base's length squared
		**************************/
		double abPyramid2 = 0.5 * lengthBasePyramid2 * Math.sqrt(Math.pow(lengthBasePyramid2, 2.0) - Math.pow((0.5 * lengthBasePyramid2), 2.0));

		/****************************
		6. Calculate the Pyramid 2 Surface area by adding its base's area to 1/2 of 3 times the base's length times the slant length
		***************************/
		double saPyramid2 = abPyramid2 + (0.5 * (3.0 * lengthBasePyramid2 * slPyramid2));

		/**********************
		7. Calculate the rectangular prism's surface area by adding 2 times length times width to 2 times length times height to 2 times width times height
		*******************/
		double saRectPrism = (2.0 * lengthRectPrism * widthRectPrism) + (2.0 * lengthRectPrism * heightRectPrism) + (2.0 * widthRectPrism * heightRectPrism);

		/***********************
		8.  Calculate the total surface area of the sculpture by adding pyramid 1 surface area to pyramid 2 surface area to the rectangular prism surface area
		*************************/
		double saTotal = saPyramid2 + saPyramid1 + saRectPrism;

		/*********************
		9. Calculate and display the total price of the current sculpture by multipling the price per inch of the sculpture material times the surface areas of both pyramids and the rectangular prism
		then adding the cost of the name plate 
		*************************/
		totalPriceOfSculpture = (sculptureTypePrice * saTotal) + namePlateCost;
		System.out.print("The total cost to build " + sculptureName + " is $");
		System.out.printf("%,.2f", totalPriceOfSculpture);
		System.out.println();


		/*********************
		10. Update and Assign the grand total of the user's sculpture(s) by adding the total of the most 
		recently calculated sculpture
		**********************/
		grandTotal += totalPriceOfSculpture;
		sculptureTypePrice = 0;
		namePlateTypePrice = 0;
		letterPrice = 0;
		namePlateCost = 0;
	}
		/******************************
 		After the Program has run the specified number of sculptures, it will prompt the user to decide 
 		to exit the program by typing "quit" or decide to continue using the program to make more sculptures.
 		*********************************/
		System.out.println();
		System.out.print("Press enter to continue shopping or type QUIT to see your grand total and exit this program: ");
		guess = input.nextLine();
	}
	/********************
	After the user has typed quit indicating they are done shopping for the day,
	this program displays their grand total for their sculpture(s) and ends the program.
	*****************/
	System.out.println();
	System.out.print("The grand total to build your metal art sculpture(s) is $");
	System.out.printf("%,.2f", grandTotal);
	System.out.println(". Thanks for shopping! Goodbye!");
	}
}