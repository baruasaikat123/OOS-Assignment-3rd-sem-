import java.util.*;
import static java.lang.System.*;
public class Q4_1{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		while(true){

		out.print("Enter points (Press q to exit):");

		String str = sc.nextLine();

		try{
            

			Scanner sc1 = new Scanner(str);

			float x1 = Integer.parseInt(sc1.next()); 
			float y1 = Integer.parseInt(sc1.next()); 

			try{
 
			    float x2 = Integer.parseInt(sc1.next()); 
			    float y2 = Integer.parseInt(sc1.next()); 

			    try{

			        float x3 = Integer.parseInt(sc1.next()); 
			        float y3 = Integer.parseInt(sc1.next()); 
	
			        display(x1,y1,x2,y2,x3,y3);
			    }
			    catch (Exception e1){

			    	display(x1,y1,x2,y2);
			    }
			}
			catch (Exception e2){

				display(x1,y1);
			} 
		}
		catch (Exception e3){

			exit(0);
		}
		
	}

	}
	static void display(float x1, float y1){

		float dist = (float)Math.sqrt(x1*x1+y1*y1);
		out.println(dist);

	}
	static void display(float x1, float y1, float x2, float y2){

		float dist = (float)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		out.println(dist);
	}
	static void display(float x1, float y1, float x2, float y2, float x3, float y3){

		float dist = (float)(0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
		out.println(dist);
	}
}