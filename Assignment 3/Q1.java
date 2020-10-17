import java.util.*;
import static java.lang.System.*;
public class Q1{
    
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		out.print("Enter the size of the array: ");
		SortedIntArray a1 = new SortedIntArray(sc.nextInt());
		out.println("1. Add element to list.");
		out.println("2. Add to sorted list.");
		int choice, i=0;
		while(i<=a1.size){
        
			out.print("Enter your choice: ");
			choice = sc.nextInt();
			if(a1.isEmpty()){

				out.println("Array is Full.");

			}
			else{

				out.print("Enter a number: ");
			    if(choice==1){

			    	a1.add(sc.nextInt());
			    	a1.printList();
                }
			    else{

			    	a1.add(sc.nextInt());
				    a1.sorted_array();
				    a1.printList();
			    }
			}
			i++;
		}
	}
}
class IntArray{

	int size;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	public IntArray(int size){

		this.size = size;
	}
	public void add(int element){

		arr.add(element);      
	}
	boolean isEmpty(){

		if(arr.size()<size){

			return false;
		}
		else{

			return true;
		}
	}
	void printList(){
        
		for(int i=0;i<arr.size();i++){

			out.print(arr.get(i)+" ");
		}
		out.println();
	}
}
class SortedIntArray extends IntArray{

	public SortedIntArray(int size){

		super(size);
	}

	public void sorted_array(){

		Collections.sort(arr);
	}
}