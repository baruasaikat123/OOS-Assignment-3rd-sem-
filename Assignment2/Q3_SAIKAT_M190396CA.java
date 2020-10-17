import java.util.*;
import static java.lang.System.*;
public class Q3_SAIKAT_M190396CA{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.println("Enter car details: ");

		Car c = new Car();
         
        c.setCarDetail(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
		out.println("OUTPUT:");
		out.println(c.e.getEngineNo()+" "+c.e.getCC()+" "+c.getColor()+" "+c.getPrice());
	}

}
class Engine{

	int engine_no;
	int cc;

	int getEngineNo(){

		return engine_no;
	}

	int getCC(){

		return cc;
	}

	void setDetail(int engine_no, int cc){

		this.engine_no = engine_no;
		this.cc = cc;
	}
}
class Car{
    
    String color;
    int price;

	Engine e = new Engine();

	/*Car(int en, int cc, String color, int price){

		e.setDetail(en,cc);
		this.color = color;
		this.price = price;
	}*/

	void setCarDetail(int engine_no, int cc, String color, int price){

		e.setDetail(engine_no,cc);
		this.color = color;
		this.price = price;
	}

	String getColor(){

		return color;
	}
	int getPrice(){

		return price;
	}

}
