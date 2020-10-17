// n+nn+nnn+nnnn = ?
import java.util.*;
import static java.lang.System.*;
import java.math.BigInteger;
public class Q1{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

        out.print("Enter number: ");
		int n = sc.nextInt();

		if(n<0){

			out.print("Enter a positive value");
		}
        else if(n==0){

        	out.print("Value of 0+00+000+0000 = 0");
        }
        else if(n<10){

            String s = Integer.toString(n);
        	out.print("Value of "+s+"+"+s+s+"+"+s+s+s+"+"+s+s+s+s+" = "+(1234*n));   // n+nn+nnn+nnnn = n/9[9+99+999+9999]
        }                                                                                //   = n/9[(10-1)+(10^2-1)+(10^3-1)]
        else{                                                                            //   = n/9[(10+10^2+10^3)-4]
                                                                                         //   = n/9[(10(10^4-1)/(10-1))-4]
        	BigInteger b = BigInteger.valueOf(n);                                    //   = 1234*n      
                BigInteger sum = BigInteger.valueOf(n);
		String s = b.toString();

		    for(int i=0;i<3;i++){

		    	s += b.toString();
			    sum = sum.add(new BigInteger(s));

		    }
            s = b.toString();
		    out.print("Value of "+s+"+"+s+s+"+"+s+s+s+"+"+s+s+s+s+" = "+sum);
        }
		
	}
}
