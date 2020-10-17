import java.util.*;
import static java.lang.System.*;
public class Q2_SAIKAT_M190396CA{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.print("Enter number of Managers: ");
		int number_of_managers = sc.nextInt();

		out.println("Enter Details: ");

		Manager man[] = new Manager[number_of_managers];

		for(int i=0;i<number_of_managers;i++){

			man[i] = new Manager(sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
		}
		out.println("OUTPUT:");
		for(int i=0;i<number_of_managers;i++){
   
			out.println(man[i].name+" "+man[i].age+" "+man[i].emp_id+" "+man[i].salary+" "+man[i].managing_dep+" "+man[i].no_of_employees_working_under);
		}

	}

}
class Person{

	protected String name;
	protected int age;
	Person(String name, int age){

		this.name = name;
		this.age = age;
	}
}
class Emp extends Person{

	protected String emp_id;
	protected int salary;
    
	Emp(String name, int age, String emp_id, int salary){
        
        super(name,age);
		this.emp_id = emp_id;
		this.salary = salary;
	}
}
class Manager extends Emp{

	protected String managing_dep;
	protected int no_of_employees_working_under;

	Manager(String name, int age, String emp_id, int salary, String managing_dep, int no_of_employees_working_under){

		super(name,age,emp_id,salary);
		this.managing_dep = managing_dep;
		this.no_of_employees_working_under = no_of_employees_working_under;
	}
}
