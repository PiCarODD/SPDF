//Prime Digital Roots
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		while(num!=0)
		{
			if(isPrime(num))
			{
				System.out.println(num+" "+num);
			}
			else{
				System.out.print(num+" ");
				String s=Integer.toString(num);
				while(s.length()!=1)
				{
					int sum=0;
					for(int i=0;i<s.length();i++)
					{
						sum+=num%10;
						num=num/10;
					}
					s=Integer.toString(sum);
					num=sum;
					if(isPrime(num))
						break;
				}
				if(isPrime(num))
				{
					System.out.println(num);
				}
				else{
					System.out.println("none");
				}
			}
			num=Integer.parseInt(br.readLine());
		}
	}

	private static boolean isPrime(int num) {
		if(num==1)
			return false;
		else if(num==2)
			return true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
