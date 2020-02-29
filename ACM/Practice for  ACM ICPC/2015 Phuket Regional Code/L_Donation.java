
import java.util.*;
public class L_Donation {
    public static void main(String[] args) {
        try {
            Scanner br = new Scanner(System.in);
            int no = Integer.parseInt(br.nextLine());
            int a = 0, b = 0, c = 0;
            String s = "";
            for (int i = 0; i < no; i++) {
                String line = br.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                a += Integer.parseInt(st.nextToken());
                b += Integer.parseInt(st.nextToken());
                c += Integer.parseInt(st.nextToken());

                if (a >= 30 && b >= 30 && c >= 30) {
                    int min = 10000;
                    min = (a < min) ? a : min;
                    min = (b < min) ? b : min;
                    min = (c < min) ? c : min;
                    a -= min;
                    b -= min;
                    c -= min;
                    s += min + "\n";
                } else {
                    s += "NO\n";
                }
            }
            System.out.println(s);
        } catch (Exception e) {
        }
    }
}


//5
//20 30 60
//20 30 60
//50 40 60
//50 10 10
//0 50 50
