package classroomproblems;

import java.util.*;

/**
 * 
 * @author DELL
 *
 */
public class Swapping {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int flag = 0, a, b;
		System.out.println("Enter the numbers to be swapped");

		a = sc.nextInt();

		b = sc.nextInt();
		flag = a;
		a = b;
		b = flag;
		System.out.println("After Swapping....");
		System.out.println("New value for a is " + a);
		System.out.println("New value for b is " + b);

	}

}
