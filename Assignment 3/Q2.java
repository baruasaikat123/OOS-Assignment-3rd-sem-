import java.util.*;
import static java.lang.System.*;
public class Q2{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
        
		out.println("1. Box\n2. Cube\n3. Cylinder\n4. Cone\n5. Exit");
        int choice, i=0;
        
        ThreeDObject t;
		while(true){

			out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice){

				case 1: out.print("Enter length, breadth and height: ");
                      
				        t = new Box(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
				        t.volume();
				        t.wholeSurfaceArea();
                        break;

                case 2: out.print("Enter the length of each side: ");
                        
                        t = new Cube(sc.nextFloat());
                        t.volume();
                        t.wholeSurfaceArea();
                        break;

                case 3: out.print("Enter the base radius and height: ");
                        t = new Cylinder(sc.nextFloat(), sc.nextFloat());
                        t.volume();
                        t.wholeSurfaceArea();                   
                        break;

                case 4: out.print("Enter the base radius and height: ");
                        t = new Cone(sc.nextFloat(), sc.nextFloat());
                        t.volume();
                        t.wholeSurfaceArea();                     
                        break;

                case 5: exit(0);
			}
		}


	}
}
abstract class ThreeDObject{

	abstract public void wholeSurfaceArea();
	abstract public void volume();
}
class Box extends ThreeDObject{

	private float l;
	private float b;
	private float h;

	public Box(float length, float breadth, float height){

		l = length;
		b = breadth;
		h = height;
	}
    
    public void volume(){

    	out.println("Volume = "+((float)Math.round(l*b*h*100)/100));
    }
	public void wholeSurfaceArea(){

		out.println("Surface area = "+((float)Math.round(2*(l*b+b*h+h*l)*100)/100));
	}
}
class Cube extends ThreeDObject{

	private float side;

	public Cube(float side){

		this.side = side;
	}

	public void volume(){

    	out.println("Volume = "+((float)Math.round(side*side*side*100)/100));
    }
	public void wholeSurfaceArea(){

		out.println("Surface area = "+((float)Math.round(6*side*side*100)/100));
	}
}
class Cylinder extends ThreeDObject{

	private float radius;
	private float height;

	public Cylinder(float radius, float height){

		this.radius = radius;
		this.height = height;
	}

	public void volume(){

    	out.println("Volume = "+((float)Math.round(Math.PI*radius*radius*height*100)/100));
    }
	public void wholeSurfaceArea(){

		out.println("Surface area = "+((float)Math.round(2*Math.PI*radius*(radius+height)*100)/100));
	}


}
class Cone extends ThreeDObject{

	private float radius;
	private float height;

	public Cone(float radius, float height){

		this.radius = radius;
		this.height = height;
	}

	public void volume(){
        
    	out.println("Volume = "+((float)Math.round(((float)1/(float)3)*Math.PI*radius*radius*height*100)/100));
    }
	public void wholeSurfaceArea(){
        
        float l = (float)Math.sqrt(radius*radius+height*height);
		out.println("Surface area = "+((float)Math.round(Math.PI*radius*(radius+l)*100)/100));
	}
}