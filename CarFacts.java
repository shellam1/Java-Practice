/****************************************************************************
* Programming Project 4 - Ice Cream Data
****************************************************************************
* This program determines and displays a number of different facts about cars given some input data about various cars.
*_____________________________________________________
* Asia Shell
* March 14, 2019
* CMSC 255 - Section 004
****************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CarFacts {
	/************
	* This main method will call the heading and Data input methods to run the program
	**************/
	public static void main(String[] args) throws IOException{
		CarFacts.printHeading();
 		CarFacts.inputData();
 	}
 	/***************
 	* This method will display statements that are included in the program's heading.
 	****************/
 	public static void printHeading() {
 		System.out.println("Asia Shell");
 		System.out.println("Project 4 - Ice Cream Data");
 		System.out.println("This program determines and displays a number of different facts about cars given some input data about various cars.");
 		System.out.println("March 14,2019");
 		System.out.println("CMSC 255 - Section 004");

 	/************
 	* This method will ask the user for the file name and will use this file to read in the 
 	* car data from the file, one item at a time.
 	*************/
 	}
	public static void inputData() throws FileNotFoundException {

	/******************************
	* The Program will now ask the user for a file name.
	*********************************/
	System.out.print("Enter the file name here : ");
	Scanner keyboard = new Scanner(System.in);
	String filename = keyboard.next();

	/*************************
	* Construct the Scanner and PrintWriter objects for reading
	* in the input file data and writing the data that will be printed in output file.
	*************************/
	File inputFile = new File(filename);
	Scanner in = new Scanner(inputFile);
	PrintWriter out = new PrintWriter("CarFactsOutput.txt");

	/********************
	* Sets scanner to read in car facts by moving between tab-delimited sets.
	* This will allow you to easily read in the car Make and Model as one string value.
	*************************/
	in.useDelimiter("\t");

	/*****************
	* Initialize the different varibles for the car with the best gas mileage rating and its mileage rating,
	* the car with the lowest price tag and its price, and the car with the best overall value and its value rating.
	* The parse method is used to convert each variable's data type to proper numeric type.
	*****************/
	String bestMileageRatingCar = in.next();
	double bestMileageRating = Double.parseDouble(in.next());
	String bestPricedCar = in.next();
	double bestPrice = Double.parseDouble(in.next());
	String bestOverallValueCar = in.next();
	double bestOverallValue = 0.0;

	/********************
	* This while loop is used to scan through each set of every string in the input file and convert them each to the
	* correct numeric type and to call the two methods which calculate the mileage rating and overall value for each car.
	* make and model of a car is represented by string makeModel, the number of miles that car can go on a tank of gas is
	* represented by numMiles, the size of the gas tank is represented by tankSize, price is the car's cost, and 
	* the rating of the car’s drivability score (how fun and easy is it to drive this car) is the drivabilityScore.
	*********************/
	in = new Scanner(inputFile);
	in.useDelimiter("\t");
		while (in.hasNext()) {
			String makeModel = in.next();
			int numMiles = Integer.parseInt(in.next());
			double tankSize = Double.parseDouble(in.next());
			double price = Double.parseDouble(in.next());
			double drivabilityScore = Double.parseDouble(in.next());

			double mileageRating = calcMileageRating(numMiles, tankSize);
			double overallValue = calcOverallValue(mileageRating, price, drivabilityScore);

			/********************
			* Each of these 3 if statements will do the job of finding the correct value for previously initialized variables 
			* (bestMileageRating, bestPrice, bestOverallValue) and each of their corresponding car's make and model.
			**********************/
			if (mileageRating < bestMileageRating) {
				bestMileageRating = mileageRating;
				bestMileageRatingCar = makeModel;
			}
			if (price < bestPrice) {
				bestPrice = price;
				bestPricedCar = makeModel;
			}
			if (overallValue > bestOverallValue) {
				bestOverallValue = overallValue;
				bestOverallValueCar = makeModel;
			}
		/************
		* The inputData() method will now call in the displayData() method with will print out the car facts data into the
		* designated output file.
		**************/
		CarFacts.displayData(makeModel, mileageRating, overallValue, out);
	}
	/****************
	* This method will now exit the while loop after it has read in all the car facts and then format and 
	* print out the results of the if statements. The method closes both the output and input file and the scanner for 
	* the user's entry.
	******************/
	out.print("The car with the best gas mileage rating is the " + bestMileageRatingCar + " with the rating of: ");
	out.printf("%.2f", bestMileageRating);
	out.println();
	out.print("The car with the best price is the " + bestPricedCar + " with the price of: $");
	out.printf("%.2f", bestPrice);
	out.println();
	out.print("The car with the best overall value is the " + bestOverallValueCar + " with the rating of: ");
	out.printf("%.2f", bestOverallValue);
	out.println();
	keyboard.close();
	in.close();
	out.close();
	}
	/****************
	* This method returns the mileage rating for each car by calculating the number of miles divided by the gas tank size.
	*******************/
	public static double calcMileageRating(int numMiles, double tankSize) {
		double mileage = ((numMiles * 1.0) / tankSize);
		return mileage;
	}
	/****************
	* This method returns the overall value for each car by calculating 
	* 0.35 of the car's mileage rating plus 0.4 of its price plus 0.25 of its drivability score
	*********************/
	public static double calcOverallValue(double mileageRating, double price, double drivabilityScore) {
		double overall = (0.35 * mileageRating + 0.4 * price + 0.25 * drivabilityScore);
		return overall;
	}
	/***************
	* This last method will be used to format and print out the make and model, gas mileage and overall value 
	* for every car to the output file called CarFactsOutput.txt
	*******************/
	public static void displayData(String makeModel, double mileageRating, double overallValue, PrintWriter out) {
		out.println(String.format("%-25s" + "%.2f mpg	" + "Value: %.2f", makeModel, mileageRating, overallValue));
	}
}