//Octal Code
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemF {

		public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		int c=Integer.parseInt(br.readLine());
		
		while(c-- >0)
		{
			String data=br.readLine();
			
			String octal="";
			for(int i=0;i<data.length();i+=3)
			{
				int n=Integer.parseInt(data.substring(i,i+3),8);
				octal+=(char)n;
				
			}
			System.out.println(octal);
		}
	}

}
