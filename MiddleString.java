// This program takes in 3 inputs and returns the middle value of the 3 inputs
 
import java.util.Scanner;

public class MiddleString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();

		if ((str1.compareTo(str2) < 0 && str2.compareTo(str3)<0)||(str3.compareTo(str2)<0 && str2.compareTo(str1)<0))
		{
			System.out.println(str2);
		}
		else if((str2.compareTo(str1)<0 && str1.compareTo(str3)<0)|| (str3.compareTo(str1)<0 && str1.compareTo(str2)<0)) 
		{
			System.out.println(str1);
		}
		else {
			System.out.println(str3);
		}

	}
}