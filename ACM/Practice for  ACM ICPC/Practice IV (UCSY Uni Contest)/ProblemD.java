//package recognizerProj;
/*
 * Language Recognition
 * FSA Recognizer Problem by Dr. TMH
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProblemD {

	
	protected int state = 0;				// current fsm state
	protected static final int fsm [][] = {
		  {1,0,0},{0,2,0},{0,3,0},{0,3,4},{0,0,0}  };
// b a !
public static boolean DReggonize(String instr)
{
	char[] carr= instr.toCharArray();
	int idx=0;
    
    int curstate=0;
    while(idx<=carr.length)
    {  
    	if(idx==carr.length)
    	{   	 
         if(curstate==4) return true;
          else return false;
    	}else    		
    	{	char i=carr[idx];
    	   int col=0;
    	  switch (i)
    	  {case 'b' : col=0; break;
    	  case 'a' : col=1; break;
    	  case '!' : col=2; break;
    	  }
    	  if(fsm[curstate][col]==0)
    		  return false;
    	  else 
    		  { 
    		  
    		  curstate= fsm[curstate][col];
    		    idx=idx+1;
    		  }
    	  
    	}// else   	
    	
    	
    }// while
    

return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//FSARecognizer c = new FSARecognizer();
		    
			/*Scanner scanner = new Scanner(System.in);*/
			
			
			InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
			
	        String str; String output="";
            boolean islang=true;
            int i=1;
			int nocases=0;
			//nocases=scanner.nextInt();
			nocases=Integer.parseInt(br.readLine());
			if(nocases<=10)
			{
				for(int j=0;j<nocases;j++)
				{
					//str=(scanner.next());
					str=br.readLine();
					if(DReggonize(str))
				    	  output=output+"Case "+(j+1)+ " : Accept "+str+"\n";
				      else
				    	  output=output+"Case "+(j+1)+" : Reject\n";
					
				}
			System.out.println(output);	
			}
	        
		    	  
		    } catch (Exception e) {
		      System.err.println(e);
		      
		    }
	}

}	
			
/*
8
baa!
ba!
baaaaaaaaaaaaaaaaa!
abbbbbb
boooo!
cdddd
baaaaaaaaaa!
baaaaa

Case 1 : Accept, baa!
Case 2 : Reject
Case 3: Accept,  baaaaaaaaaaaaaaaaa!
Case 4: Reject
Case 5: Reject
Case 6: Reject
Case 7: Accept,  baaaaaaaaaa!
Case 8: Reject

 */
	
	
