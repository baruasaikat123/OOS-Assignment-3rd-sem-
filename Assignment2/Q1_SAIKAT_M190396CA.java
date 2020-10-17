import java.util.*;
import static java.lang.System.*;
public class Q1_SAIKAT_M190396CA{

	public static void main(String args[]){

		Scanner sc  = new Scanner(System.in);

		out.print("Enter number of students: ");
		int number_of_student = sc.nextInt();

		out.println("Student Details: ");
        
        Student s[] = new Student[number_of_student];
		for(int i=0;i<number_of_student;i++){

			s[i] = new Student();
			s[i].setDetail(sc.next(),sc.next(),sc.nextFloat());
		}
		out.println("OUTPUT:");
		for(int i=0;i<number_of_student;i++){
            
            float percentage = convert_percentage(s[i].getCGPA());
			out.println(s[i].getName()+" "+s[i].getRoll()+" "+s[i].getCGPA()+" "+percentage+"%");
		}
	}
	private static float convert_percentage(float n){
        
		return n*(float)9.5;
	}
}
class Student{

	private String name;
	private String roll;
	private float cgpa;

	String getName(){

		return name;
	}
	String getRoll(){

		return roll;
	}
	float getCGPA(){

		return cgpa;
	}

	void setDetail(String name, String roll, float cgpa){

		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
	}

}
