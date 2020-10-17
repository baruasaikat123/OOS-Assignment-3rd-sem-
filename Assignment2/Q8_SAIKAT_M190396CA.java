import java.util.*;
import static java.lang.System.*;
public class Q8_SAIKAT_M190396CA{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		while(true){
            
            out.println();
            out.println("***************************");
			out.println("a. Add two numbers.");
		    out.println("b. Add three numbers.");
		    out.println("c. -1*number");
		    out.println("d. EXIT");
		    out.println("***************************");
		    out.println();

		    out.print("Enter option: ");
		    int choice = sc.nextInt();
		    int ans;
		    switch(choice){

		    	case 1: out.print("Enter two numbers: ");
		    	        ans = calculate(sc.nextInt(), sc.nextInt());
		    	        out.println("Sum is "+ans);
		    	        break;

		    	case 2: out.print("Enter three numbers: ");
		    	        ans = calculate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		    	        out.println("Sum is "+ans);
		    	        break;

		    	case 3: out.print("Enter a number: ");
		    	        ans = calculate(sc.nextInt());
		    	        out.println("Ans is "+ans);
		    	        break;

		    	case 4: exit(0);

		    	default: out.println("Enter a valid choice.");

		    }
		}

	}
	static int calculate(int num1, int num2){

		return num1+num2;
	}
	static int calculate(int num1, int num2, int num3){

		return num1+num2+num3;
	}
	static int calculate(int num){

		return -1*num;
	}


}
