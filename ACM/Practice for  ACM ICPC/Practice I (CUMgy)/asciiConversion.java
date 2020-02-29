import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class asciiconversion {

	/**
	 * @param argsre
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int c;
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		c=Integer.parseInt(br.readLine());
		while(c-- >0)
		{
			String st=br.readLine();
			for(int i=0;i<st.length()-1;i+=2)
			{
				int ch=Integer.parseInt(st.substring(i,i+2));
				System.out.print((char)ch);
			}
			System.out.println();
			
		}

	}

}
