// 1/1!+2/2!+3/3!+...+n/n!  =  2+1/2!+1/3!+...+1/(n-1)!
import java.util.*;
import static java.lang.System.*;
import java.math.*;
public class Q8{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

        out.print("Enter the value of n: ");
		int n = sc.nextInt();

		if(n==0){

			out.print("0");
		}
		else if(n==1){

			out.print("1");
		}
		else{

			BigInteger f = BigInteger.valueOf(1);

            double sum = 2.0;

            for(int i=2;i<n;i++){

            	f = f.multiply(BigInteger.valueOf(i));
        	    sum += 1/(f.doubleValue());
            }
            out.print((double)Math.round(sum*100000)/100000);
		}	

	}
}