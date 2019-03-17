 /*************************************************************************
 * Project 2 - Metal Art
 ************************************************************************** 
 * This project displays the area and costs of building a model sculpture based on user input for the size of the pyramids and rectangular prism. 
 * _______________________________________________________________________
 * Asia Shell
 * February 6, 2019
 * CMSC 255 Section 004
 ************************************************************************/

import java.util.Scanner;

	public class MetalArt
	{
	public static void main(String[] args)
	{
		System.out.println("Asia Shell");
 		System.out.println("Project 2 - Metal Art");
 		System.out.println("This project displays the surface area and costs of building a model sculpture based on user input for the size of the pyramids and rectangular prism.");
 		System.out.println("February 6,2019");
 		System.out.println("CMSC 255 Section 004");

		Scanner sc = new Scanner(System.in);

		// Initialize a name for the Sculpture 
		System.out.print("Enter the name of the sculpture: ");
		String nameSculpture = sc.nextLine();

		// Assign a whole number value to the length of one of the base sides on Pyramid 1 in inches
		System.out.print("Enter the length of the base of the first pyramid (inches): ");
		int lengthBasePyramid1 = sc.nextInt();

		// Assign a whole number value to the height of Pyramid 1 in inches
		System.out.print("Enter the height of the first pyramid (inches): ");
		int heightPyramid1 = sc.nextInt();

		// Assign a whole numbe value to the length of one of the base sides on Pyramid 2 in inches
		System.out.print("Enter the length of the base of the second pyramid (inches): ");
		int lengthBasePyramid2 = sc.nextInt();

		// Assign a whole number value to the height of Pyramid 2 in inches
		System.out.print("Enter the height of the second pyramid (inches): ");
		int heightPyramid2 = sc.nextInt();

		//Assign a whole number value to the height of the Rectangular Prism in inches
		System.out.print("Enter the height of the rectangular prism (inches): ");
		int heightRectPrism = sc.nextInt();

		// Assign a whole number value to the length of the Rectangular Prism in inches
		System.out.print("Enter the length of the rectangular prism (inches): ");
		int lengthRectPrism = sc.nextInt();
		
		// Assign a whole number value to the width of the Rectangular Prism in inches
		System.out.print("Enter the width of the rectangular prism (inches): ");
		int widthRectPrism = sc.nextInt();
		
		// Calculate the slant length of the first Pyramid by taking the sqaure root of half of 1/2 of Pyramid 1 Base's length squared plus its height sqaured 
		double slPyramid1 = Math.sqrt((Math.pow((0.5 * lengthBasePyramid1), 2.0)) + (Math.pow(heightPyramid1, 2.0)));

		// Calculate the area of the base of the first pyramid by taking 1/2 of the base's length times the sqaure root of the base's length sqaured minus the sqaure root of half of 1/2 of Pyramid 1 Base's length squared
		double abPyramid1 = 0.5 * lengthBasePyramid1 * Math.sqrt(Math.pow(lengthBasePyramid1, 2.0) - Math.pow((0.5 * lengthBasePyramid1), 2.0));

		// Calculate the Surface area of Pyramid 1 by adding the pyramid 1 base's area to 1/2 of 3 times the base's length times the slant length
		double saPyramid1 = abPyramid1 + (0.5 * (3.0 * lengthBasePyramid1 * slPyramid1));

		//Calculate pyramid 2's slant length by taking the sqaure root of half of 1/2 of Pyramid 2 Base's length squared plus its height sqaured 
		double slPyramid2 = Math.sqrt((Math.pow((0.5 * lengthBasePyramid2), 2.0)) + (Math.pow(heightPyramid2, 2.0)));

		// Calculate pyramid 2 base's area by taking 1/2 of the base's length times the sqaure root of the base's length sqaured minus the sqaure root of half of 1/2 of Pyramid 2 Base's length squared
		double abPyramid2 = 0.5 * lengthBasePyramid2 * Math.sqrt(Math.pow(lengthBasePyramid2, 2.0) - Math.pow((0.5 * lengthBasePyramid2), 2.0));

		// Calculate the Pyramid 2 Surface area by adding its base's area to 1/2 of 3 times the base's length times the slant length
		double saPyramid2 = abPyramid2 + (0.5 * (3.0 * lengthBasePyramid2 * slPyramid2));

		// Calculate the rectangular prism's surface area by adding 2 times length times width to 2 times length times height to 2 times width times height
		double saRectPrism = (2.0 * lengthRectPrism * widthRectPrism) + (2.0 * lengthRectPrism * heightRectPrism) + (2.0 * widthRectPrism * heightRectPrism);

		// Calculate the total surface area of the sculpture by adding pyramid 1 surface area to pyramid 2 surface area to the rectangular prism surface area
		double saTotal = saPyramid2 + saPyramid1 + saRectPrism;

		// Calculate the price of the sculpture by multipling the cost of the material, which is $1.67 per inch, times the surface areas of both pyramids and the rectangular prism
		double priceSculpture = 1.67 * saTotal;

		// Output the initial statement for listing the surface area calculations
		System.out.println("The " + nameSculpture + " surface area calculations are:");

		// Output the surface area of Pyramid 1 with comma spacing and two decimals places
		System.out.print("Surface area of the first pyramid: ");
		System.out.printf("%,.2f", saPyramid1);
		System.out.println(" square inches");

		// Output the surface area of Pyramid 2 with comma spacing and two decimals places
		System.out.print("Surface area of the second pyramid: ");
		System.out.printf("%,.2f", saPyramid2);
		System.out.println(" square inches");

		// Output the surface area of the rectangular prism with comma spacing and two decimals places
		System.out.print("Surface area of the rectangular prism: ");
		System.out.printf("%,.2f", saRectPrism);
		System.out.println(" square inches");

		// Output the total surface area of the sculpture 
		System.out.print("Total Surface area: ");
		System.out.printf("%,.2f", saTotal);
		System.out.println(" square inches");

		// Output the statement for the total cost of the material to build the sculpture in the dollar amount
		System.out.print("The total cost of the material to build " + nameSculpture);
		System.out.print(" is $");
		System.out.printf("%,.2f", priceSculpture);
		
		System.out.println();
	}
}
