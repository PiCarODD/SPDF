//Right Triangle
import java.io.*;
import java.util.*;
public class ProblemRC {    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
             int t = Integer.parseInt(br.readLine());
                
            for (int i = 0; i < t; i++) {
                String text=br.readLine();
                StringTokenizer st=new StringTokenizer(text, " ");
                int a = Integer.parseInt(st.nextToken());
                 int b = Integer.parseInt(st.nextToken());
                  int c = Integer.parseInt(st.nextToken());
                if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
                System.out.println("1");
                else System.out.println("0");
            }
        } catch (Exception e) {
        }
    }
}

