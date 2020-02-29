/*
 * Matrix Manipulation problem by Dr. PHM
 * 
 */
import java.util.Scanner;

public class ProblemRD {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);		
		
		String firstMatrixDimension[]=s.nextLine().trim().split(" ");
		
		String firstMatrix[]=s.nextLine().trim().split(" ");
		
		String secondMatrixDimension[]=s.nextLine().trim().split(" ");
		
		String secondMatrix[]=s.nextLine().trim().split(" ");
		
		int power=Integer.parseInt(s.nextLine());
		
		int row1=Integer.parseInt(firstMatrixDimension[0]);
		
		int col1=Integer.parseInt(firstMatrixDimension[1]);
		
		long[][] A=new long[row1][col1];
		int k=0;
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				A[i][j]=Integer.parseInt(firstMatrix[k]);
				k++;
			}
		}
				
		int row2=Integer.parseInt(secondMatrixDimension[0]);
		
		int col2=Integer.parseInt(secondMatrixDimension[1]);
		
		long[][] B=new long[row2][col2];
		k=0;
		
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				B[i][j]=Integer.parseInt(secondMatrix[k]);
				k++;
			}
		}
		
		if((row1==col2) && (col1==row2))
		{
			long[][] M=new long[row1][col2];
							
			 for(int i=0; i<row1; i++)
			{
			    for(int j=0; j<col2; j++)
			    {
			    	 M[i][j] = 0;

			    	 for(int c=0; c<col1; c++)
			    		 M[i][j] = M[i][j] + A[i][c] * B[c][j];
			    	 
			    	 if(j==col2-1)System.out.print(M[i][j]); 
else System.out.print(M[i][j]+" ");
			     } 
			    System.out.println();
			 }
			 
			 long[][] M1=new long[row1][col2];
			 for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col2; j++)
				{
						M1[i][j]=M[i][j]; 
				}					
			}
						
		long[][] P=new long[row1][col2];
			 
			for(int p=0;p<power-1;p++)
			{			
				for(int i=0; i<row1; i++)
				{
					for(int j=0; j<col2; j++)
					{
						P[i][j] = 0;
						for(int c=0; c<col2; c++)
							P[i][j] = P[i][j] + M1[i][c] * M[c][j];	
					} 			    
				}
				for(int i=0; i<row1; i++)
				{
					for(int j=0; j<col2; j++)
					{
							M1[i][j]=P[i][j]; 
					}					
				}								
			}
			
			System.out.println("Power of "+power+":");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col2; j++)
				{
				if(j==col2-1)System.out.print(P[i][j]); 
					else System.out.print(P[i][j]+" "); 
				}
				System.out.println();
			}
		}
		else System.out.println("Invalid Input Matrix");

	}

}
/*
2 3
1 2 3 2 2 2
3 2
1 2 1 2 1 2
2
///////////
6 12 
6 12 
Power of 2:
108 216 
108 216
///////////
 
2 3
1 2 3 2 2 2
3 2
1 2 1 2 1 2
3
///// 
6 12 
6 12 
Power of 3:
1944 3888 
1944 3888 
/////

2 3
1 2 3 2 2 2
3 2
1 2 1 2 1 2
5
/////
6 12 
6 12 
Power of 5:
629856 1259712 
629856 1259712 
/////

3 2
1 1 4 1 2 2
3 3
1 1 1 1 1 1 1 1 1
2
Invalid Matrix
 
 */
