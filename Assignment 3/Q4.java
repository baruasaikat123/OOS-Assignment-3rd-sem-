import java.util.*;
import static java.lang.System.*;
public class Q4{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.println("1. Add Binary Number\n2. Add Decimal Number\n3. Add Hexadecimal Number\n4. Display Numbers\n5. Exit");
		int choice, i=0, value=0;
		Number n[] = new Number[1000];
		while(true){

			out.print("Enter your choice: ");
			choice = sc.nextInt();
			if(choice<4){

				out.print("Enter value: ");
			    value = sc.nextInt();
			}
			
			switch(choice){

				case 1: n[i] = new BinaryNumber(value);
				        i++;
				        break;
				case 2: n[i] = new DecimalNumber(value);
				        i++;
				        break;
				case 3: n[i] = new HexadecimalNumber(value);
				        i++;
				        break;
				case 4: for(int k=0;k<i;k++){

					         n[k].showNumber();
				        }
				        break;
				case 5: exit(0);

				default: out.println("Enter a valid choice.");

			}
		}
	}
}
abstract class Number{

	protected int num;

	public Number(int num){

		this.num = num;
	}

	abstract public void showNumber();
}
class BinaryNumber extends Number{

	public BinaryNumber(int num){

		super(num);
	}

	public void showNumber(){

		out.println("Binary "+Integer.toBinaryString(num));
	}
}
class DecimalNumber extends Number{

	public DecimalNumber(int num){

		super(num);
	}

	public void showNumber(){

		out.println("Decimal "+num);
	}
}
class HexadecimalNumber extends Number{

	public HexadecimalNumber(int num){

		super(num);
	}

	public void showNumber(){

		out.println("Hexadecimal "+Integer.toHexString(num));
	}
}