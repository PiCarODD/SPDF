/*
 * IMEI_Validator
 * IMEI validation problem by Dr. PHM
 * 
 */
import java.util.Scanner;

public class ProblemC {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int no_of_case=Integer.parseInt(s.nextLine());
		
		if(no_of_case>=0 && no_of_case<=20)
		{
		
		
		String[] input=new String[no_of_case];
		
		for(int k=0;k<no_of_case;k++)
		{
			input[k]=s.nextLine();			
		
		String TAC ="";
		
		String serial ="";
		
		String check_digit="";
		
		TAC=input[k].substring(0,8);

		serial=input[k].substring(8);
		
		serial=serial.substring(0,6);
		
		check_digit=input[k].substring(14);
		
		int check=Integer.parseInt(check_digit);
		
		
		
		String tac_serial=TAC+serial;
		
		char[] char_arr=tac_serial.toCharArray();
		
		int[] a=new int[char_arr.length];
		
		for(int i=0;i<char_arr.length;i++)
		{
			
			if(i%2==1){ 
				a[i]=((int)char_arr[i]-48)*2;

				if(a[i]>9)a[i]=a[i]-9;
			}
			else a[i]=(int)char_arr[i]-48;
		}

		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}		

		int mod=sum%10;
		
		int valid=0;

		if(mod!=0) valid=10-mod;		
				
		System.out.println("Case "+(k+1)+":"+TAC+" "+serial+" "+check_digit);
		
		if(valid==check) System.out.println(1);
		   else System.out.println(0);
		
		}	
		}
	}
}
/*
3
353538057997225 		Case 1:35353805 799722 5
						1

352939072105730			Case 2:35293907 210573 0
						1

353051013170287   		Case 3:35305101 317028 7
						0
    
*/

/*
6 
353538057997225
352939072105730
353051013170287
353951013970287    				
352951003980286
353538057997221

Case 1:35353805 799722 5
1
Case 2:35293907 210573 0
1
Case 3:35305101 317028 7
0
Case 4:35395101 397028 7
1
Case 5:35295100 398028 6
0
Case 6:35353805 799722 1
0

 */
