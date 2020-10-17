/* if two integers are equal, then retuen 0, if two integers have the same remainder when divided by 3, then return the smaller integer, otherwise return the larger integer */
import java.util.*;
import static java.lang.System.*;
public class Q4{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.print("First number: ");
		int num1 = sc.nextInt();

		out.print("Second nuber: ");
		int num2 = sc.nextInt();

		int ans = result(num1,num2);

		out.print("Result : " + ans);
	}

	public static int result(int n1, int n2){

		if(n1 == n2){

			return 0;
		}
		else if((n1%3) == (n2%3)){

			return n1 < n2 ? n1 : n2;
		}
		else{

			return n1 > n2 ? n1 : n2;
		}

	}

}
