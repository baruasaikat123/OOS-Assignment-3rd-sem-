import java.util.*;
import static java.lang.System.*;
public class Q4_2{
    
    static int sum = 0;
    static String sum1 = "";
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		while(true){

			out.print("Enter array (Press q to exit):");

			String str = sc.nextLine();
			ArrayList<Integer> arr = new ArrayList<Integer>();
            
			
            try{
                
                Scanner sc1 = new Scanner(str);
            	arr.add(Integer.parseInt(sc1.next()));	
            	
            	try{

            		while(true){

            			arr.add(Integer.parseInt(sc1.next()));				    
			        }
                }
                catch (Exception e1){

                	for(int i=0;i<arr.size();i++){

                		add(arr.get(i));
			        }
			        out.println(sum); 
			        sum = 0;               	
                }
			  	
		    }
		    catch (Exception e2){

		    	try{	
                    
                    Scanner sc2 = new Scanner(str);
		    	    int value = (int)Float.parseFloat(sc2.next());
                    arr.add(value);
		    	    try{

		    	    	while(true){

		    	    		value = (int)Float.parseFloat(sc2.next());
		    	            arr.add(value); 
		    		    }
		    	    }

		    	    catch (Exception e3){
     
		    	    	for(int i=0;i<arr.size();i++){

		    	    		add(arr.get(i));
		    	    	}
		    	    	out.println(sum);
		    	    	sum = 0;
		    	    }
		    		
		        }
		        catch (Exception e4){

		        	ArrayList<Character> arr1 = new ArrayList<Character>();
                    
                    Scanner sc3 = new Scanner(str);
                    char c = sc3.next().charAt(0);
                    if(c=='q'){

                    	exit(0);
                    }
                    else{
                        
                        arr1.add(c);
                    	try{

                    		while(true){

                    			arr1.add(sc3.next().charAt(0));
                    		}
                    	}
                    	catch (Exception e5){

                    		for(int i=0;i<arr1.size();i++){

                    			add(arr1.get(i));
                    		}
                    		out.println(sum1);
                    		sum1 = "";
                    	}
                    }	            	
		    	}
		    }
		}
	}

	static void add(int x){

		sum += x;
	}
	static void add(char x){
              
		sum1 += String.valueOf(x);
	}
}