import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class modex {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int c;
		int x,y,n;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		c=Integer.parseInt(br.readLine());
		
		while(c-- >0)
		{
			String[] line=br.readLine().split(" ");
			x=Integer.parseInt(line[0]);
			y =Integer.parseInt(line[1]);
			n=Integer.parseInt(line[2]);
			System.out.println((int)(Math.pow(x, y)%n));
		}
	}

}
