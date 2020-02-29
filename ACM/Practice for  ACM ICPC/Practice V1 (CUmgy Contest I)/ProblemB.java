//IMEI Validattion
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int line=Integer.parseInt(br.readLine());
        
       while(line-- > 0)
       {
    	  long n = Long.parseLong(br.readLine());          
    	  String s = Long.toString(n); 
        
            int d = 0, sum = 0;
            for(int i=15; i>=1; i--)
            {
                d = (int)(n%10);
                 
                if(i%2 == 0)
                {
                    d = 2*d; 
                    sum = sum + sumDig(d);
                }
                else sum = sum + d; 
                n = n/10;
            }
          
            if(sum%10==0)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }

	private static int sumDig(int d) {
		int s=0;
		while(d!=0)
		{
			s+=d%10;
			d=d/10;
		}
		return s;
	}

	}
