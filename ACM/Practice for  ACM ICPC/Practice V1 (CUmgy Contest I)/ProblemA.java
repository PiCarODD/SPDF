//Number in Fibo
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

		public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		     int line= Integer.parseInt(br.readLine());
		      
		    while(line-- > 0)
		     {
		    	int n=Integer.parseInt(br.readLine());
		         int a=0, b=1 ,c=0; 
		               
		          while(c<n) 
		          {
		              c = a + b; 
		              a = b;
		              b = c;
		          }
		                     
		           if(c==n) 
		              System.out.println("1");
		           else
		              System.out.println("0");
		     }
	}

}
