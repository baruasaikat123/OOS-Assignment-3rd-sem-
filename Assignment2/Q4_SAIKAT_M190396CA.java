import java.util.*;
import static java.lang.System.*;
public class Q4_SAIKAT_M190396CA{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		out.print("Enter number of employees: ");
		int no_of_employee = sc.nextInt();

		Employee e[] = new Employee[no_of_employee];
		out.println("Enter details: ");
        for(int i=0;i<no_of_employee;i++){

        	e[i] = new Employee();
        	e[i].get_detail();
        }
        out.println("OUTPUT:");
		for(int i=0;i<no_of_employee;i++){

			e[i].show_detail();
		}
	}
}
class Employee{

	String name;
	protected String emp_id;
    Scanner sc = new Scanner(System.in);
	void get_detail(){

		name = sc.next();
		emp_id = sc.next();
	}
	void show_detail(){

		out.println(name+" "+emp_id);
		
	}
}
