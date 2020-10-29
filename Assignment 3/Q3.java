import java.util.*;
import static java.lang.System.*;
public class Q3{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		out.println("1. Admit new student\n2. Migrate Hostel\n3. Search a student\n4. Exit");
		int choice, i=0, c=0;
		String regi, hostel, str;
        Student s[] = new Student[1000];
		while(true){

			out.print("Enter your choice: ");
			choice = sc.nextInt();
            sc.nextLine();
			switch(choice){

				case 1: s[i] = new Student();
				        out.println("Enter the student details: ");
                        
                        
                        out.print("Name = ");                       
                        s[i].setStudentName(sc.nextLine());
                        while(true){

                        	out.print("Registration Number = ");
                            str = sc.nextLine();
                            if(i>0){

                            	c=0;
                        	    for(int k=0;k<i;k++){

                        	    	if((s[k].getRegisterNo()).equalsIgnoreCase(str)){

                        	    		out.print("Registration Number already exists. ");
                        			    c++;
                        			    break;
                        		    }
                        	    }
                            }
                            if(c==0){

                            	s[i].setRegisterNo(str);
                            	break;
                            }
                        }
                        
                        out.print("ElectiveSubject = ");
                        
                        s[i].setElectiveSubject(sc.nextLine());
                        out.print("Average Mark = ");
                        s[i].setAvgMarks(sc.nextFloat());
                        sc.nextLine();
                        out.println("Enter the department details: ");
                        
                        out.print("Department Name = ");
                        s[i].d.setDeptName(sc.nextLine());
                        out.print("Department Head = ");
                        s[i].d.setDeptHead(sc.nextLine());
                        out.println("Enter the hostel details: ");
                       
                        out.print("Hostel Name = ");
                        s[i].h.setHostelName(sc.nextLine());
                        out.print("Hostel Location = ");
                        s[i].h.setHostelLocation(sc.nextLine());
                        out.print("Number of Rooms = ");
                        s[i].h.setNumberofRooms(sc.nextInt());
                        sc.nextLine();
                        i++;
                        break;

                case 2: out.print("Enter the student registration number and new hostel: ");
                        regi = sc.next();
                        hostel = sc.next();

                        for(int k=0;k<i;k++){

                        	if((s[k].getRegisterNo()).equalsIgnoreCase(regi)){

                        		s[k].h.setHostelName(hostel); 
                        		c++;
                        		break;
                        	}
                        }
                        if(c==0){

                        	out.println("Enter a valid registration number.");
                        }
                        c=0;
                        break;

                case 3: out.print("Enter the registration number: ");
                        regi = sc.next();
                       
                        for(int k=0;k<i;k++){

                        	if((s[k].getRegisterNo()).equalsIgnoreCase(regi)){

                        		s[k].printStudent();
                        		c++;
                        		break;
                        	}
                        }
                        if(c==0){

                        	out.println("Enter a valid registration number.");
                        }
                        c=0;
                        break;

                case 4: exit(0);

                default: out.println("Enter a valid choice.");
			}
		}
	}
}
class Department{

	private String deptName;
	private String deptHead;

	void setDeptName(String deptName){

		this.deptName = deptName;
	}

	void setDeptHead(String deptHead){

		this.deptHead = deptHead;
	}

	String getDeptName(){

		return deptName;
	}
}
class Hostel{

	private String hostelName;
	private String hostelLocation;
	private int numberofRooms;

	void setHostelName(String hostelName){

		this.hostelName = hostelName;
	}
	void setHostelLocation(String hostelLocation){

		this.hostelLocation = hostelLocation;
	}
	void setNumberofRooms(int numberofRooms){

		this.numberofRooms = numberofRooms;
	}

	String getHostelName(){

		return hostelName;
	}
}
class Student{

	private String studentName;
	private String registerNo;
	private String electiveSubject;
	private float avgMarks;

	Department d = new Department();
	Hostel h = new Hostel();

	void setStudentName(String studentName){

		this.studentName = studentName;
	}

	void setRegisterNo(String registerNo){

		this.registerNo = registerNo;
	}

	void setElectiveSubject(String electiveSubject){

		this.electiveSubject = electiveSubject;
	}

	void setAvgMarks(float avgMarks){

		this.avgMarks = avgMarks;
	}

	String getRegisterNo(){

		return registerNo;
	}

	public void printStudent(){

		out.println(studentName+" "+registerNo+" "+electiveSubject+" "+avgMarks+" "+d.getDeptName()+" "+h.getHostelName());
	}
}
