// All unique permutations of a string
import java.util.*;
import static java.lang.System.*;
public class Q3{
    
    static HashSet<String> h = new HashSet<>();
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

        out.print("Enter a string: ");
		String s = sc.nextLine();
        int n = s.length();
		permutation(s,0,n-1);

	}
	static void permutation(String s,int x,int y){

		if(x==y){

            if(h.contains(s)){
          
            	return;
            }
            h.add(s);
			out.println(s);
			return;
		}
		for(int i=x;i<=y;i++){

			s = change(s,x,i);
			permutation(s,x+1,y);
			s = change(s,x,i);
		}
	}
	static String change(String s,int i,int j){

		char arr[] = s.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
 	}
}