/* Partition the array into three equal sum segments:
Input: 1, 3, 6, 2, 7, 1, 2, 8
Output: [1, 3, 6], [2, 7, 1], [2, 8]
Input: 7, 6, 1, 7
Output: [7], [6, 1], [7]
Input: 7, 6, 2, 7
Output: Cannot divide the array into segments */

import java.util.*;
import static java.lang.System.*;
public class Q9{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		out.print("Enter the size of the array: ");
		int n = sc.nextInt();

		if(n==0){

			out.print("Nothing to print");
		}
		else{

			int arr[] = new int[n];
			int sum = 0;
            out.print("Enter the array: ");
			for(int i=0;i<n;i++){

				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			if(sum%3!=0){

				out.print("Cannot divide the array into segments.");
			}
			else{

				int divide_sum = sum/3, count=0, index1=0, index2=0;
				sum = 0;
				for(int i=0;i<n;i++){

					sum += arr[i];
					if(sum==divide_sum){

						count++;
						sum = 0;
					}
					if(count==1 && sum==0){

						index1 = i;
					}
					if(count==2 && sum==0){

						index2 = i;
					}
				}
				if(count>=3 && sum==0){
                    
                    out.print("[");
					for(int i=0;i<=index1;i++){

						out.print(arr[i]);
						if(i<index1){

							out.print(",");
						}
					}
					out.print("], [");
					for(int i=index1+1;i<=index2;i++){

						out.print(arr[i]);
						if(i<index2){

							out.print(",");
						}
					}
					out.print("], [");
					for(int i=index2+1;i<n;i++){

						out.print(arr[i]);
						if(i<n-1){

							out.print(",");
						}
					}
					out.print("]");
				}
				else{

					out.print("Cannot divide the array into segments.");
				}
			}
		}
	}
}
