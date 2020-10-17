/* shuffle all the elements of an array so that all the odd numbers come before all the even numbers.
input: {1,2,3,4,5,6,7}    output: {1,3,5,7,2,4,6}   */
import java.util.*;
import static java.lang.System.*;
public class Q5{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
        
        out.print("Enter the size of the array: ");
		int n = sc.nextInt();
        int arr[] = new int[n];
		out.print("Enter the array: ");
		for(int i=0;i<n;i++){

			arr[i] = sc.nextInt();
		}
		int i=0,j=0;
		while(j<n){

			if(arr[j]%2!=0){

				swap(arr,i,j);
				i++;
				j++;
			}
			else{

				j++;
			}
		}
	//	Arrays.sort(arr,0,i);
	//	Arrays.sort(arr,i,n);
		for(int k=0;k<n;k++){

			out.print(arr[k]+" ");
		}
	}
	static void swap(int arr[],int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}