package classroomproblems;
import java.util.*;
/**
 * 
 * @author DELL
 *
 */

public class EvenOdd {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the number to be checked");
	int number;
	number=sc.nextInt();
	if(number%2==0) {
		System.out.println("Number is Even");
	}
	else {
		System.out.println("Number is odd");
	}
	}

}
