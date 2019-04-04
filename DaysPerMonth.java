import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/******************************************************************************
 *   DaysPerMonth 
 *   VCU - Computer Science Department
 *   A program that prompts the user for a month and year (both as integers)
 *   then displays the number of days in that month.
 ******************************************************************************/
 class DaysPerMonth {

   public static void main(String[] args) throws FileNotFoundException {
     
   /**************************************************************************
    * Expect the user to enter a file containing numeric month numbers from the command line
    *************************************************************************/
     File inputFile = new File("lab11data.txt");
     Scanner input = new Scanner(inputFile);
  
     /***************************************************************************
      * loop through the file taking a month and a year and determining the days for that month
      ****************************************************************************/
     while (input.hasNext()) {
         int month = input.nextInt();
         int year = input.nextInt();
                  
         /*************************************************************************
         * determine the number of days in the month
         **************************************************************************/
         int numDays = getDays(month, year);

         /*************************************************************************
         * display number of days in the month
         **************************************************************************/
         System.out.println("There are " + numDays + " days in this month.");
      }// end while loop   
    
   }// end main
   
   /************************************************************
    * method to determine the days for the given month and year
    ************************************************************/
   private static int getDays(int mon, int yr) {
     int numDays = 0;
     
     switch(mon) {
       case 2: // February
         numDays = 28;
         if (yr % 4 == 0) {
           numDays = 29;
           if (yr % 100 == 0 && yr % 400 != 0)
             numDays = 28;
         }
         break;
         
       case 4:   //April
       case 6:   // June
       case 9:   // September
       case 11:  // November
         numDays = 30;
         break;
         
       default: numDays = 31;  // all the rest
     }
     return numDays;
   }

}
