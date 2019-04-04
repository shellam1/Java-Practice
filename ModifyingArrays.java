/**********************************************
 * Modifying Arrays
 * Kylan Thomson and Nana Twumasi-Ankrah Asia Shell
 * CMSC 255 Sec 004
 * 03/27/2019
 */
public class ModifyingArrays {
	public static void addTo10(int [][] array) {
		for(int j = 0; j < array.length; j++) { // Iterating through list of arrays
			int rowTotal = 0; // Initializes row total with zero
			for (int i = 0; i <array[j].length; i++) { // Iterating through individual array
				rowTotal = rowTotal + array[j][i]; 
			}
			
		int diffto10 = 10 - rowTotal; // Find difference between the current row total and zero
		
		for (int i = 0; i < array[j].length; i++) { // Iterating through individual array
			 if (array[j][i] == 0) { // Finds index of zero element
				 array[j][i] = diffto10; // Modifies zero to make row total 10 
			 }
	 	}
		}
	 
   }
   
   public static void setHints(int [][] array) {
	   for(int j = 0; j < array.length; j++) { // Iterating through list of arrays
		   for (int i = 0; i < array[j].length; i++) { // Iterating through individual array
			   if (isBomb(array[j][i])) { // Find bomb
				   // Modify cells around bomb
				   if (isInBounds((j + 1), (i + 1) , array) && !isBomb(array[j + 1][i + 1])) {
					   array[j + 1][i + 1] += 1; // Bottom right corner
				   }
				   if (isInBounds((j - 1), (i - 1) , array) && !isBomb(array[j - 1][i - 1])) {
					   array[j - 1][i - 1] += 1; // Top left corner
				   }
				   if (isInBounds((j + 1), (i - 1) , array) && !isBomb(array[j + 1][i - 1])) {
					   array[j + 1][i - 1] += 1; // Bottom left corner
				   }
				   if (isInBounds((j - 1), (i + 1) , array) && !isBomb(array[j - 1][i + 1])) {
					   array[j - 1][i + 1] += 1; // Top right corner
				   }
				   if (isInBounds((j - 1), (i) , array) && !isBomb(array[j - 1][i])) {
					   array[j - 1][i] += 1; // Top 
				   }
				   if (isInBounds((j + 1), (i) , array) && !isBomb(array[j + 1][i])) {
					   array[j + 1][i] += 1; // Bottom
				   }
				   if (isInBounds((j), (i + 1) , array) && !isBomb(array[j][i + 1])) {
					   array[j][i + 1] += 1; // Right
				   }
				   if (isInBounds((j), (i - 1) , array) && !isBomb(array[j][i - 1])) {
					   array[j][i - 1] += 1; // Bottom
				   }
			   }
			}
		}
	}

   
   public static boolean isInBounds(int i, int j, int[][] board){
         return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
   }

   public static boolean isBomb(int value){
         return value == -1;
   }

   
   public static void main(String[] args) 
  { 
    
    int [][] matrix = {{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, -1, 0, -1}, 
      {0, 0, 0, -1, 0, 0}, {0, 0, 0, 0, 0, 0}};
    int [][] matrix2 = {{6, 3, 2, 0, 4}, {34, 53, 0, 23, 1}, {0, 23, 54, 11, 7}};
    int [][] matrix3 = { { 0, -1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
    addTo10(matrix2);
    setHints(matrix);
    setHints(matrix3);
   
  } 
   
}
 


