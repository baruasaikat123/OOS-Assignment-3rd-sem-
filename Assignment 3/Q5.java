import java.util.*;
import static java.lang.System.*;
public class Q5{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		Customer c = new Customer();
		Membership m = new Membership();;
		
		Service s[] = new Service[10];
		int i, total, choice, quant;
        String mem;
		while(true){
            
            out.println("1. Customer Details\n2. Exit");
            out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==1){
            out.println("Enter Customer Details:");
			out.print("Name: ");
            c.setName(sc.nextLine());
			out.print("Mobile: ");
			c.setMobile(sc.nextLine());
		    
            out.print("Membership: ");
            m.setMember(sc.nextLine());
            mem = m.getMember();
            i=0;
            while(true){

            	out.print("Add Service(Y/N): ");
            	s[i] = new Service();
            	s[i].setAns(sc.next().charAt(0));
            	sc.nextLine();
            	if(s[i].getAns()=='Y' || s[i].getAns()=='y'){
                    
            		out.print("ServiceName: ");
            		s[i].setServiceName(sc.nextLine());
            		out.print("Rate: ");
            		s[i].setRate(sc.nextInt());
            		out.print("Quantity: ");
            		quant = sc.nextInt();
            		sc.nextLine();
            		s[i].setQuantity(quant);
            		i++;
            	}
            	else if(s[i].getAns()=='N' || s[i].getAns()=='n'){

            		break;
            	}
            }
            out.println();
            out.println("***********BILL***************");
            out.println();
		    out.println(c.getName()+"  "+c.getMobile()+"  "+mem);
		    total = 0;
		    for(int k=0;k<i;k++){

		    	out.println((k+1)+". "+s[k].getServiceName()+" (x"+s[k].getQuantity()+")"+"   "+s[k].getRate()*s[k].getQuantity());
		    	total += s[k].getRate()*s[k].getQuantity();
		    }
		    out.println("Total: "+total);
		    total = discount_fee(total, mem);
		    out.println("Please Pay: "+total);
		    out.println();
		    out.println("*****************************");
		}
		else if(choice==2){

			exit(0);
		}
		else{

			out.println("Please enter a valid choice.");
		}
		}
	}
	static int discount_fee(int amount, String mem){

		if(mem.equalsIgnoreCase("Premium")){

			amount -= amount*0.2;
		}
		else if(mem.equalsIgnoreCase("Gold")){

			amount -= amount*0.15;
		}
		else if(mem.equalsIgnoreCase("Silver")){

			amount -= amount*0.1;
		}
		return amount;
	}
}

class Customer{

	String name;
	String mobile;

	String getName(){

		return name;
	}

	String getMobile(){

		return mobile;
	}

	void setName(String name){

		this.name = name;
	}

	void setMobile(String mobile){

		this.mobile = mobile;
	}

}
class Service{

	String servicename;
	int quantity;
	int rate;
	char ans;

	void setAns(char ans){

		this.ans = ans;
	}
    void setQuantity(int quantity){

    	this.quantity = quantity;
    }
    void setServiceName(String servicename){

    	this.servicename = servicename;
    }
    void setRate(int rate){

    	this.rate = rate;
    }
    int getRate(){

    	return rate;
    }
    String getServiceName(){

    	return servicename;
    }
	char getAns(){

		return ans;
	}
	int getQuantity(){

		return quantity;
	}
}
class Membership{

	String member;

	void setMember(String member){

		this.member = member;
	}

	String getMember(){

		return member;
	}
}