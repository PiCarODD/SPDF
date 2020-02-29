import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mispell {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int line=Integer.parseInt(br.readLine());
		
		int setno=1;
		while(line-->0)
		{
			String[] data=br.readLine().split(" ");
			int n=Integer.parseInt(data[0]);
			String ss=data[1];
			
			String newss="";
			for(int i=0;i<ss.length();i++)
				if(i+1!=n) newss+=ss.charAt(i);
			
			System.out.println(setno+" "+newss);
			setno++;
		}
		
	}

}
