package classroomproblems;
import java.util.*;
/**
 * 
 * @author DELL
 *
 */
public class QuotientRemainder {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int number,operand;
		System.out.println("Enter the number to be checked");
		number=sc.nextInt();
		System.out.println("Enter the Divisor");
		operand=sc.nextInt();
		double quotient=number/operand;
		 double remainder = number%operand;
		 System.out.println("Quotient is "+quotient);
		 System.out.println("Remainder is "+remainder);
		
		
	}

}
