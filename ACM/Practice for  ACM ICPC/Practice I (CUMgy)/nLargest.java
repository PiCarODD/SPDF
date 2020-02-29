import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nLargest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int line=Integer.parseInt(br.readLine());
		
		while(line-->0)
		{
			String[] data=br.readLine().split(" ");
			int n=Integer.parseInt(data[0]);
			ArrayList<Integer> aa=new ArrayList<Integer>(data.length-1);
			for(int i=1;i<data.length;i++)
			{	int x=Integer.parseInt(data[i]);
				aa.add(x);
				//System.out.println(x);
			
			}
			Collections.sort(aa);
			System.out.println(n+" "+aa.get(aa.size()-3));
			
		}
	}

}
