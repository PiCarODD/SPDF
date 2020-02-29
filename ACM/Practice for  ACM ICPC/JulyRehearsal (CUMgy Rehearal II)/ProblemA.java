import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemA {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int data=Integer.parseInt(br.readLine());
	       while(data-- >0)
	       {
			
	        String n=br.readLine(); //inputting the number and storing it in a String
	 
	        int c=0; 				//variable for counting number of zero digits
	        char ch;
	        for(int i=1;i<n.length();i++)
	        {
	            ch=n.charAt(i);	 //extracting each digit and checking whether it is a '0' or not
	            if(ch=='0')
	                c++;
	        }
	         char f=n.charAt(0); //taking out the first digit of the inputted number
	         if(c>0 && f!='0')
	            System.out.println("1");
	        else
	            System.out.println("0");
	       }
	}

}
