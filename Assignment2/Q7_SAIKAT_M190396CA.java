import java.util.*;
import static java.lang.System.*;
public class Q7_SAIKAT_M190396CA{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.print("Enter the number of shapes: ");
		int no_of_shape = sc.nextInt();

		float area, perimeter;
        Circle c[] = new Circle[no_of_shape];
        Rectangle r[] = new Rectangle[no_of_shape];
        Square s[] = new Square[no_of_shape];
        int k1=0, k2=0, k3=0;
        for(int i=0;i<no_of_shape;i++){

        	out.print("Enter 1 for Circle, 2 for Rectangle, 3 for Square: ");
        	int choice = sc.nextInt();
        	if(choice==1){

        		out.print("Enter radius: ");
        		c[k1] = new Circle();
        		c[k1].get_detail();
        		show_detail(c[k1].area(),c[k1].perimeter());
                k1++;
        	}
        	else if(choice==2){

        		out.print("Enter Length and Bredth: ");
        		r[k2] = new Rectangle();
        		r[k2].get_detail();
        		show_detail(r[k2].area(),r[k2].perimeter());
                k2++;
        	}
        	else{

        		out.print("Enter Side: ");
        		s[k3] = new Square();
        		s[k3].get_detail();
        		show_detail(s[k3].area(),s[k3].perimeter());
                k3++;
        	}
        }
        out.print("Enter the threshold value: ");
        float value = sc.nextFloat();
        int count=0;
        out.println("The shapes are: ");
        if(k1!=0){

            for(int i=0;i<k1;i++){

                if(c[i].area() > value){

                    out.println("Circle"+"("+c[i].radius+")");
                    count++;
                }
            }
        }
        if(k2!=0){

            for(int i=0;i<k2;i++){

                if(r[i].area() > value){

                    out.println("Rectangle"+"("+r[i].length+","+r[i].bredth+")");
                    count++;
                }
            }
        }
        if(k3!=0){

            for(int i=0;i<k3;i++){

                if(s[i].area() > value){

                    out.println("Square"+"("+s[i].side+")");
                    count++;
                }
            }
        }
        if(count==0){

        	out.println("None of area of the shape is above the threshold value.");
        }
        
	}
	static void show_detail(float a, float p){

		out.println("The area is "+(float)Math.round(a*100)/100+" and the perimeter is "+(float)Math.round(p*100)/100);
	}

}
class Circle{

	float radius=0;
	Scanner sc = new Scanner(System.in);

	void get_detail(){

		radius = sc.nextFloat();
	}

	float area(){

		return (float)Math.PI*radius*radius;
	}
	float perimeter(){

		return (float)(2*Math.PI)*radius;
	}

}
class Rectangle{

	float length=0;
	float bredth=0;
    Scanner sc = new Scanner(System.in);
	void get_detail(){

		length = sc.nextFloat();
		bredth = sc.nextFloat();
	}

	float area(){

		return length*bredth;
	}
	float perimeter(){

		return 2*(length+bredth);
	}
}
class Square{

	float side=0;
    Scanner sc = new Scanner(System.in);
	void get_detail(){

		side = sc.nextFloat();
	}

	float area(){

		return side*side;
	}

	float perimeter(){

		return 4*side;
	}
}
