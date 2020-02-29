//Number Pattern
import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		//do{
		Scanner reader = new Scanner(System.in);
		 n=reader.nextInt();
		//}while(n%2==0 && n<10);	
		
		while(n!=0 && n%2!=0)
		{
			int myarray[][] = new int[n][n+1];
			int i,j;
			for(i=0;i<1;i++)
			{
				for(j=0;j<n;j++)
				{
					myarray[i][j]=i+1;				
				}
				myarray[i][n]=i+2;
			}
			for(i=1;i<myarray.length;i++)
			{
				if(i%2 !=0)//odd rows
				{
					j=1;
					myarray[i][0] = i+2;
					while(j<=n)
					{
						myarray[i][j] = i+1;
						j++;
					}
					j = 1;
				}
				if(i%2==0)//even row
				{
					j=0;
					while(j<n)
					{
						myarray[i][j]=i+1;
						j++;
					}
					myarray[i][n]=i+2;
					j=0;
				}
			}
			for(int row=0;row<n;row++)
			{
				for(int col=0;col<n+1;col++)
				{
					System.out.print(myarray[row][col]);
				}
				System.out.println();
			}
			 n=reader.nextInt();
			
		}
		
	}

}
