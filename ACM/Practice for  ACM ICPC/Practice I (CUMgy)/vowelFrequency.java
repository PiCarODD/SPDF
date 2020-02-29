import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class vowelFrequency {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String line;int j;
		char[] vl={'a','e','i','o','u'};
		int[] count ;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		line=br.readLine();
		while (line.charAt(0) != '#')
		{
			count = new int[vl.length];
			for(int i=0;i<line.length();i++)
			{
				for(int k=0;k<vl.length;k++)
					if(Character.toLowerCase(line.charAt(i))==vl[k])
						count[k]++;
			}
			
			 int max = -1;
		      for (j = 0; j < count.length; j++)
		        {
		        if (count[j] > max)
		            { max = count[j]; }
		        }
		     
		      
		      for ( ; max >= 0; max--)
		        {
		        for (j = 0; j < count.length; j++)
		          {
		          if (count[j] == max)
		              {
		              System.out.print( "  "+vl[j] + ":" + count[j]);
		            
		              }
		          }
		        }
		      System.out.println(".");
			
			line=br.readLine();
		}
		
	}

}
