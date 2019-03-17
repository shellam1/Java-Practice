import java.util.Scanner;
public class PrintStrings
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		if (str1.compareTo(str2)<0) {
			System.out.println(str1 + " " + str2);
		}
		else {
			System.out.println(str2 + " " + str1);
		}

	}
}

