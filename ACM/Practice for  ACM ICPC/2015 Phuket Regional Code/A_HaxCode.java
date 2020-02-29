
import java.util.Scanner;
public class A_HaxCode {
    static String convert(String s) {
        String ss = "";
        while (s.length() >= 2) {
            String str = s.substring(0, 2);
            s = s.substring(2);
            int j = Integer.parseInt(str, 16);
            ss += (char) j + "";
        }
        return ss;
    }

    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   use br.readLine();
            Scanner br = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                String text = br.nextLine();
                String result = convert(text);
                System.out.println(result);
            }
        } catch (Exception e) {
        }
    }
}

//4869204D61726B
//41726520796F7520616C6976653F
