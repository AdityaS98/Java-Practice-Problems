package classroomproblems;
import java.util.*;
/**
 * 
 * @author DELL
 *
 */
public class Tableprog {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num,expo;
		num=sc.nextInt();
		expo=sc.nextInt();
		if(num<=31) {
			System.out.println("Number should be less than 31");
			}
		else {
			for (int i = expo; i <= num; i++) {
				System.out.println("The Powers of number are"+expo);
				
			}
		}
		
		
		

	}

}
