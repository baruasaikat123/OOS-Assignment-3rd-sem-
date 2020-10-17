import java.util.*;
import static java.lang.System.*;
public class Q6_SAIKAT_M190396CA{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		out.print("Enter the number of Line objects: ");
		int no_of_object = sc.nextInt();

		Line l[] = new Line[no_of_object+1];

		for(int i=1;i<=no_of_object;i++){

			out.print("Enter Starting and Ending Coordinates for Line "+i+": ");

			l[i] = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			l[i].getLength();
		}
		int max = l[1].length;
		int min = l[1].length;
		for(int i=2;i<=no_of_object;i++){

			if(max<=l[i].length){

				max = l[i].length;
			}
			if(min>=l[i].length){

				min = l[i].length;
			}
		}
		if(max==min){

			out.println("There are no difference between max and min value of length.");
			out.println("The Length is "+max);
		}
		else{
		int k=0;
		for(int i=1;i<=no_of_object;i++){

			if(l[i].length==max){

				k++;
			}
			if(k>=2 && l[i].length==max){

				out.print(" or Line "+i);
			}
			if(k==1){

				if(l[i].length==max){

					out.print("The largest Line is Line "+i);
			    }
			}
		}
		out.println(" with length "+max);
	    k=0;
	    for(int i=1;i<=no_of_object;i++){

			if(l[i].length==min){

				k++;
			}
			if(k>=2 && l[i].length==min){

				out.print(" or Line "+i);
			}
			if(k==1){

				if(l[i].length==min){

					out.print("The smallest Line is Line "+i);
			    }
			}
	    }
		out.println(" with length "+min);
	}
	}

}
class Point{

	int x;
	int y;


	static int findLength(int x1, int y1, int x2, int y2){

		return (int)Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
	}
	
}
class Line{
    
    Scanner sc = new Scanner(System.in);

	Point p1 = new Point();
	Point p2 = new Point();
    int length;
	/*void get_detail(){

		p1.x = sc.nextInt();
		p1.y = sc.nextInt();
		p2.x = sc.nextInt();
		p2.y = sc.nextInt();
		length = Point.findLength(p1.x, p1.y, p2.x, p2.y);
	}*/
	Line(int start1, int end1, int start2, int end2){

		p1.x = start1;
		p1.y = end1;
		p2.x = start2;
		p2.y = end2;
	}

	int getLength(){

		length = Point.findLength(p1.x, p1.y, p2.x, p2.y);
		return length;
	}
}
