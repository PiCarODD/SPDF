import java.util.Scanner;

//Pronic Number
public class ProblemA {

	public static void main(String[] args) {

			// TODO Auto-generated method stub
			 Scanner sc = new Scanner(System.in);    
		        int line= sc.nextInt();
		        int start, end;
		     
		        while(line-- > 0)
		        {
		        	start=sc.nextInt();
		        	end=sc.nextInt();
		        	
		        	int pn;
		        	int count=0;
		        	for(int i=0; i<=end; i++)
		            {
		            	pn=i*(i+1);
		                if(pn>=start && pn<=end)
		                {
		                	count++;
		                }
		            }
		            System.out.println(count);
		        }
		                
		}

	}
