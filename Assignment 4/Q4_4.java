import java.util.*;
import static java.lang.System.*;
public class Q4_4{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		TaxCalculate f;
		Vehicle v[] = new Vehicle[100000];
		float arr[] = new float[100000];
        int k=0;
		while(true){
            
            out.println();
			out.println("1. Add Vehicle\n2. Display Vehicles\n3. Exit");
			out.println();
			out.print("Enter your choice: ");
			int choice = sc.nextInt();
			out.println();
			switch(choice){

				case 1: out.println("a. Car\nb. Truck");
				        out.print("Enter your choice: ");
				        char c = sc.next().charAt(0);
				        sc.nextLine();
				        out.println();
				        if(c=='a'){

				        	v[k] = new Car();
				        	out.print("ModelNumber: ");
				        	v[k].setModel(sc.nextLine());
				        	out.print("Rate: ");
				        	v[k].setRate(sc.nextFloat());
				        	sc.nextLine();
				        	out.print("FuelType(petrol/diesel): ");
				        	v[k].setFule(sc.nextLine());
				        	out.print("passengers: ");
				        	int passenger = sc.nextInt();
				        	sc.nextLine();
				        	f = new Car();
				        	arr[k] = f.calculateTax(v[k].getFuel(),passenger,v[k].getRate());
				        	k++;
				        	out.println();
				        	
				        }
				        else if(c=='b'){

				        	v[k] = new Truck();
				        	out.print("ModelNumber: ");
				        	v[k].setModel(sc.nextLine());
				        	out.print("Rate: ");
				        	v[k].setRate(sc.nextFloat());
				        	sc.nextLine();
				        	out.print("FuelType(petrol/diesel): ");
				        	v[k].setFule(sc.nextLine());
				        	out.print("LoadLimit: ");
				        	int load = sc.nextInt();
				        	sc.nextLine();
				        	f = new Truck();
				        	arr[k]=f.calculateTax(v[k].getFuel(),load,v[k].getRate());
                            k++;
                            out.println();
				        }
				        break;

				case 2: for(int i=0;i<k-1;i++){

					        for(int j=i+1;j<k;j++){

					        	if(arr[i]<arr[j]){

					        		float temp = arr[i];
					        		arr[i] = arr[j];
					        		arr[j] = temp;

					        		String temp1 = v[i].model;
					        		v[i].model = v[j].model;
					        		v[j].model = temp1;

					        		String temp2 = v[i].fuel;
					        		v[i].fuel = v[j].fuel;
					        		v[j].fuel = temp2;
					        	}
					        }
				        }

				        for(int i=0;i<k;i++){

				        	out.println(v[i].getModel()+" "+v[i].getFuel()+" "+arr[i]);
				        }
				        break;

				case 3: exit(0);

				default: out.println("Enter a valid choice."); 
			}
		}
	}
}
interface TaxCalculate{
    
	float calculateTax(String s, int n, float r);
}

class Vehicle{

	String model;
	float rate;
	String fuel;
	int numberOfWheels;

    void setModel(String model){

    	this.model = model;
    }
    void setRate(float rate){

    	this.rate = rate;
    }
    void setFule(String fuel){

    	this.fuel = fuel;
    }
	String getModel(){

		return model;
	}
	float getRate(){

		return rate;
	}
	String getFuel(){

		return fuel;
	}

}

class Car extends Vehicle implements TaxCalculate{

	int passengers;

	public float calculateTax(String f, int passengers, float rate){


		if(f.equalsIgnoreCase("petrol")){

			return (float)(rate*passengers*0.05);
		}
		else if(f.equalsIgnoreCase("diesel")){

			return (float)(rate*passengers*0.04);
		}
		else{

			return 0;
		}
	}
}
class Truck extends Vehicle implements TaxCalculate{

	int loadLimit;


	public float calculateTax(String fl, int loadLimit, float rate){

		this.loadLimit = loadLimit;

		if(fl.equalsIgnoreCase("petrol")){

			return (float)(rate*loadLimit*0.001);
		}
		else if(fl.equalsIgnoreCase("diesel")){

			return (float)(rate*loadLimit*0.0008);
		}
		else{

			return 0;
		}
	}
}
