/* array-form of difits of a number+1
input = {9,9,9}  output = {1,0,0,0}  (999+1=1000) */
import java.util.*;
import static java.lang.System.*;
public class Q7{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
        
        out.print("Enter size of the array: ");
		int n = sc.nextInt();
        
        if(n==0){

        	out.print("Nothing to print");
        }
        else{

        	int arr[] = new int[n+1];
            int count = 0;
            out.print("Enter the array: ");
		    for(int i=0;i<n;i++){

		    	arr[i]  = sc.nextInt();
			    if(arr[i] == 9){

			    	count++;
			    }
		    }
		    out.print("Output array: ");
		    if(arr[n-1]!=9){

		    	arr[n-1] += 1;
			    for(int i=0;i<n;i++){

			    	out.print(arr[i]+" ");
			    }
		    }
            else if(count==n){

            	arr[0] = 1;
        	    out.print(arr[0]+" ");
        	    for(int i=1;i<n+1;i++){

        	    	arr[i] = 0;
        		    out.print(arr[i]+" ");
        	    }
            }
            else{

            	int k = n-1, value = 1;
        	    while(k>=0 | value>0){

        	    	if(k>=0){

        	    		value += arr[k];
        		    }
        		    arr[k] = value%10;
        		    value = value/10;
        		    k--;
        	    }
        	    for(int i=0;i<n;i++){

        	    	out.print(arr[i]+" ");
        	    }
            }
        }       
	}
}
