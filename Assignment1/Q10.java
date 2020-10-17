// Matrix Multiplication
import java.util.*;
import static java.lang.System.*;
public class Q10{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		out.println("First Matrix: ");
        out.print("Enter number of rows: ");
        int m1 = sc.nextInt();
        out.print("Enter number of columns: ");
		int n1 = sc.nextInt();
		int arr1[][] = new  int[m1][n1];
		
        out.println("Enter matrix elements: ");

		for(int i=0;i<m1;i++){

			for(int j=0;j<n1;j++){

				arr1[i][j] = sc.nextInt();
			}
		}
        out.println("Second Matrix: ");
        out.print("Enter number of rows: ");
        int m2 = sc.nextInt();
        out.print("Enter number of columns: ");
		int n2 = sc.nextInt();
        if(n1!=m2){

        	out.print("Multiplication is not possible. Number of columns of the first matrix and number of rows of the second matrix should be same.");
        }
        else{

            int x = n1;
            int arr2[][] = new int[x][n2];
            out.println("Enter matrix elements: ");
        	for(int i=0;i<x;i++){

        		for(int j=0;j<n2;j++){

        			arr2[i][j] = sc.nextInt();
			    }
		    }

		    matrix_multiply(arr1,arr2,m1,x,n2);
        }
    }
	static void matrix_multiply(int arr1[][], int arr2[][],int m1, int x, int n2){

		int arr[][] = new int[m1][n2];

		for(int i=0;i<m1;i++){

			for(int j=0;j<n2;j++){

				arr[i][j] = 0;

				for(int k=0;k<x;k++){

					arr[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		print_matrix(arr,m1,n2);
	}
    static void print_matrix(int arr[][], int m1, int n2){ 

    	out.println("Multiplication of the matrix: ");
		for(int i=0;i<m1;i++){

			for(int j=0;j<n2;j++){

				out.print(arr[i][j]+" ");
			}
			out.println("");
		}
	}

}
