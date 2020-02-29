
import java.io.*;
import java.util.*;
public class ProblemRB {     
    public static boolean isPrime(int i){
        int d=2;
        while (i%d!=0) d++;
        if(d==i) return true;
        return false;
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
             int t = Integer.parseInt(br.readLine());
                
            for (int i = 0; i < t; i++) {
                String text=br.readLine();
                StringTokenizer st=new StringTokenizer(text, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int count=0;
                for (int j=a;j<=b-2;j++){
                    if(isPrime(j) && isPrime(j+2)) {
                        count++; //System.out.println(count+" - "+j+","+(j+2));
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
        }
    }
}

