import java.util.*;
import static java.lang.System.*;
public class Q5_SAIKAT_M190396CA{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.println("Enter SBI customer details:");
		SBI s = new SBI();
		s.account_holder_name = sc.next();
		s.balance = sc.nextInt();
		float credited_amount = sc.nextInt();
		float debited_amount = sc.nextInt();
		s.credit(credited_amount);
		s.debit(debited_amount);
		float interest_sbi = s.calculate_interest();

		out.println("Enter HDFC customer details:");
		HDFC h = new HDFC();
		h.account_holder_name = sc.next();
		h.balance = sc.nextInt();
		credited_amount = sc.nextInt();
		debited_amount = sc.nextInt();
		h.credit(credited_amount);
		h.debit(debited_amount);
		float interest_hdfc = h.calculate_interest();
        out.println("OUTPUT:");
        out.println(s.account_holder_name+" "+s.balance+" "+interest_sbi);
		out.println(h.account_holder_name+" "+h.balance+" "+interest_hdfc);

	}
}
class Account{

	protected String account_holder_name;
	protected float balance;

	void credit(float n){
        
        balance = balance + n;
	}
	void debit(float n){

		balance = balance - n;
	}
}
class SBI extends Account{

	float calculate_interest(){

		return balance*(float)0.08;
	}

}
class HDFC extends Account{

	float calculate_interest(){

		return balance*(float)0.07;
	}
}
