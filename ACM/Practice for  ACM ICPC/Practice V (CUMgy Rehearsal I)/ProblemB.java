// Remove Duplicate Chars
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemB {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s = br.readLine();
	        while(s.charAt(0)!='#')
	        {
	        	 int l = s.length();
	             char ch;
	             String ans="";
	              
	             for(int i=0; i<l; i++)
	             {
	                 ch = s.charAt(i);
	                 if(ch!=' ')
	                     ans = ans + ch;
	                 s = s.replace(ch,' ');
	             }
	             System.out.println(ans);
	             s=br.readLine();
	        }
	       
	        
	    }
	}