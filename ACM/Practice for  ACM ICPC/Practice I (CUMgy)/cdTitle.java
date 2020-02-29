import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CDtitle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String numSt = null;
		ArrayList tempSt=new ArrayList();
		int max=36;
		//String[] ss = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		numSt=br.readLine();
		while (!numSt.equalsIgnoreCase("#"))
		{
			tempSt.add(numSt);
			numSt=br.readLine();
			
			
		}
		String[] ss=(String[]) tempSt.toArray(new String[0]);
			
		for(int i=0;i<ss.length;i++)
			System.out.print("--");
		System.out.println("-");
		for (int i = 0; i < max; i++)
	      {
	      for (int j = 0; j < ss.length; j++)
	        {
	        if (ss[j].length() > i)
	           System.out.print("|" + ss[j].charAt(i)); 
	        else
	           System.out.print("| "); 
	        }
	      System.out.println("|");
	      }
		for(int i=0;i<ss.length;i++)
			System.out.print("--");
		System.out.println("-");	
		
	}

}