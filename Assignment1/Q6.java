/* To find all pairs of an array with given sum:
Input
Enter the array
{1, 4, 45, 5, 10, -8, 14}
Let the sum to find be 15
Output
The pairs whose sum is 15 are 1, 14
5, 10
*/
import java.util.*;
import static java.lang.System.*;
public class Q6{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.print("Enter size of the array: ");
		int n = sc.nextInt();

		if(n==0){

			out.println("Nothing to print.");
		}
        else{

        	int arr[] = new int[n];
		    out.print("Enter the array: ");
		    for(int i=0;i<n;i++){

		    	arr[i] = sc.nextInt();
		    }
		    out.print("Enter the sum = ");
		    int sum = sc.nextInt();

		    if(n==1){

		    	out.println("No such pair is possible");
		    }
		    else{
                
		    	find_element(arr,n,sum);
		    }
        }

	}

	static void find_element(int arr[],int n,int sum){

		//HashSet<Integer> h = new HashSet<>();
        int c=0;
        out.println("The pairs whose sum is "+sum+" are : ");
		for(int i=0;i<n-1;i++){
            int element = arr[i];
			for(int j=i+1;j<n;j++){

				if(arr[j]==sum-element){
                    
                    out.println(element+" "+(sum-element));
					c++;
				}
			}
		}
		if(c==0){

			out.println("No such pair exits");
		}

	}

}
