package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class weekend {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		String[] dl={"sun","mon","tue","wed","thu","fri","sat"};
		String[] m={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
		int c;
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		c=Integer.parseInt(br.readLine());
		while(c-- > 0)
		{
			String[] dd=br.readLine().split(" ");
			String mm=dd[0];
			String wd=dd[1];
			int count=0;
			int dnum = 0;
			int startday = 0;
			for( i=0;i<m.length;i++)
				if(mm.equalsIgnoreCase(m[i])) {
					dnum=days[i];
					break;
				}
			for(int j=0;j<dl.length;j++)
				if(wd.equalsIgnoreCase(dl[j]))
				{ startday=j;
					break;
				}
			
			for(i=0;i<dnum;i++ )
			{
				if(dl[startday%7].equalsIgnoreCase("fri") || dl[startday%7].equalsIgnoreCase("sat"))
					count++;
				
				startday++;
				
			}
			System.out.println(count);
			
		}
						

	}

}
