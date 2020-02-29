//Area
import java.io.IOException;
import java.util.Scanner;


public class ProblemC{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 Scanner sc = new Scanner(System.in);   
		 int line=sc.nextInt();
		
	        while(line-- > 0)
	        {
	        	int x=sc.nextInt();
	        	int y=sc.nextInt();
	        	int z=sc.nextInt();
	        	int s= (int) (0.5*(x+y+z));
	        	double area=(double) Math.sqrt(s*(s-x)*(s-y)*(s-z));
	        	
	        	System.out.println(area);
	        }
	}

}
