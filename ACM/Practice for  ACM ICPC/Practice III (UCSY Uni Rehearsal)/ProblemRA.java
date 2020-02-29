//Armstrong Number
import java.io.*;

public class ProblemRA {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(br.readLine());
                int a = num % 10;
                int b = (num / 10) % 10;
                int c = num / 100;
                int ans = (a * a * a) + (b * b * b) + (c * c * c);
                if (ans == num) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        } catch (Exception e) {
        }
    }
}
