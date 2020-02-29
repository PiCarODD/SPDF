import java.util.*;
public class B_ContestStrategy {
    public static void main(String[] args) {
        try {
            Scanner br = new Scanner(System.in);
            int no = Integer.parseInt(br.nextLine());
            for (int i = 0; i < no; i++) {
                String line = br.nextLine();
                StringTokenizer st = new StringTokenizer(line, " ");
                int aNo = Integer.parseInt(st.nextToken());
                int max = Integer.parseInt(st.nextToken());

                line = br.nextLine();
                st = new StringTokenizer(line, " ");
                int list[] = new int[aNo];
                for (int j = 0; j < aNo; j++) {
                    list[j] = Integer.parseInt(st.nextToken());
                }

                Arrays.sort(list);

                int total = 0, subTotal = 0, count = 0;
                for (int j = 0; j < aNo; j++) {
                    if (subTotal + list[j] < max) {
                        count++;
                        subTotal += list[j];
                        for (int k = 0; k <= j; k++) {
                            total += list[k];  //System.out.print(list[k]+" ");
                        }
                    } else { break; }
                    ///System.out.println("");
                }
                System.out.println(count + " " + subTotal + " " + total);
            }
        } catch (Exception e) {}
    }
}

//2
//6 100
//15 23 41 12 15 20
//5 200
//23 45 35 49 28
