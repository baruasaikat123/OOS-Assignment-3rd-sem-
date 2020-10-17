/* Equality of two strings
Input:  String 1: Hi all             Output: Strings are not equal!
        String 2: How are you?         */

import java.util.*;
import static java.lang.System.*;
public class Q2{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.print("String 1: ");
		String s1 = sc.nextLine();

		out.print("String 2: ");
		String s2 = sc.nextLine();

		if(s1.equalsIgnoreCase(s2)){

			out.print("Strings are equal!");
		}
		else{

			out.print("Strings are not equal!");
		}


	}


}
