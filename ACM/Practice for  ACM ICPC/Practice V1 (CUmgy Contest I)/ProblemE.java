//Message Encryption
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemE {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		int c=Integer.parseInt(br.readLine());
		while(c-->0)
		{
			
			String ss=br.readLine();
			String mm="";
			for(int i=0;i<ss.length();i++)
				{
				char ch=ss.charAt(i);
				if((ch>='A' && ch<='Z')|| (ch>='a'&& ch<='z'))
				{
					if(ch=='Z' || ch=='z')
						 ch=(char)(ss.charAt(i)+1-26);
					else ch=(char)(ss.charAt(i)+1);
				}
							
				mm+=ch;	
				}
			String rev=new StringBuilder(mm).reverse().toString();
			System.out.println(rev);
		}
	}

}
