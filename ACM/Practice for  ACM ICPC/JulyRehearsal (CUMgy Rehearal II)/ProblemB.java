import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemB {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String page;
	    
	  
	    int pCount = 0, assgin, max;

	    // Initialise the lookup table values.
	    String[] webpages = new String[] {"Home","Content","Subjects","Classes"};
	    int[] counts=new int[4];
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    page = br.readLine();
	    
	    while ((page.length() != 1) || (page.charAt(0) != '#'))
	      {
	     
	    	  String log[]=page.split(" ");
	    	  for (assgin = 0; assgin < webpages.length; assgin++)
	    	         counts[assgin] = 0; 
	    	  
	    	  for (pCount = 0; pCount < log.length; pCount++)
	    	  {
	    		  for (assgin = 0; assgin < webpages.length; assgin++)
	    		  {
	          	  if ((log[pCount]).equalsIgnoreCase(webpages[assgin]))
	             
	        		  counts[assgin]++; 
	                    
	    		  }
	    	  }
	    
	          for (pCount = 0; pCount < 4; pCount++)
	            System.out.print(webpages[pCount] + ":" + counts[pCount]+" ");
	          System.out.println();
	          page = br.readLine();
	        }
	}

}
