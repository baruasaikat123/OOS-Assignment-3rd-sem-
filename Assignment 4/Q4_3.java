import java.util.*;
import static java.lang.System.*;
public class Q4_3{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
        String str;
		Distance t[] = new Distance[10000];
        int k=0;
		while(true){

			out.print("Enter distance (Press d to display, q to exit): ");
			str = sc.nextLine();
			StringBuffer num = new StringBuffer();
			StringBuffer s = new StringBuffer();

			if(str.charAt(0)=='q'){

				exit(0);
			}
			else if(str.charAt(0)=='d'){

				for(int i=0;i<k;i++){

					t[i].display();
				}
			}
			else{

				for(int i=0;i<str.length();i++){

					if(Character.isDigit(str.charAt(i))){

						num.append(str.charAt(i));
				    }
				    else if(Character.isAlphabetic(str.charAt(i))){

				    	s.append(str.charAt(i));
				    }
			    }
                int x = Integer.parseInt(num.toString());
			    if(s.charAt(0)=='m'){

			    	t[k] = new Distance();
			    	t[k].travelTime(x);
			    	k++;
			    }
			    else if(s.charAt(0)=='k'){

			    	t[k] = new DistanceKS();
			    	t[k].travelTime(x);
			    	k++;
			    }
		    }
					
		}
	}

}
class Distance{

	float time;

	void travelTime(int value){
		
		time = 0.05f * value;
	}

	void display(){

		out.println((float)Math.round(time*10)/10+" seconds");
	}


}
class DistanceKS extends Distance{

	void travelTime(int value){

		time = (1/72f)*value;
	}

	void display(){

		out.println((float)Math.round(time*10)/10+" hours");
	}

}