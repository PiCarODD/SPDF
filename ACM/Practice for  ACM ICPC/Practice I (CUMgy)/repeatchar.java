import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class repeatChar {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int p;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		p=Integer.parseInt(br.readLine());
		
		while (p-- > 0)
		{
			String[] line=br.readLine().split(" ");
			int n=Integer.parseInt(line[0]);
			int t=Integer.parseInt(line[1]);
			String st=line[2];
			String nst="";
			for(int i=0;i<st.length();i++)
			{
				for(int k=0;k<t;k++)
					nst+=st.charAt(i);
			}
			System.out.println(n +"  "+nst);
		}

	}

}
