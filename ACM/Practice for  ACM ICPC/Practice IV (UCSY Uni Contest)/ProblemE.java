/*
 * Secret Message by Dr. ANO
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemE
  {
  
  public static final char[][] cipherSets = {
    { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' },
    { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' },
   { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',  'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }
 };

  public static int mod(int x, int n)
    { return ((x % n) + n) % n; }

  public static char cipher(char c, int shift)
    {
    int setPos, letterPos, cipherPos;

    for (setPos = 0; setPos < cipherSets.length; setPos++)
      {
      for (letterPos = 0; letterPos < cipherSets[setPos].length; letterPos++)
        {
        if (cipherSets[setPos][letterPos] == c)
          {
          cipherPos = mod(letterPos + shift, cipherSets[setPos].length);
          return cipherSets[setPos][cipherPos];
          }
        }
      }

    return c;
    }

  public static String encode(String word, int shift)
    {
    int pos;
    char[] answer;

    answer = new char[word.length()];
    for (pos = 0; pos < answer.length; pos++)
      { answer[pos] = cipher(word.charAt(pos), shift); }
    return new String(answer);
    }


  public static void main(String[] args) throws Exception
    {
    BufferedReader myReader;
    String line;
    int shift, pos;

    myReader = new BufferedReader(new InputStreamReader(System.in));
    line = myReader.readLine();
    while ((line != null) && (line.charAt(0) != '#'))
      {
      pos = line.indexOf(':');
      shift = Integer.parseInt(line.substring(0, pos));
      System.out.println(encode(line.substring(pos+1, line.length()), shift));

      line = myReader.readLine();
      } 
    } 
  } 
/*
0:original message
1:University of Computer Studies, Yangon
2:University Programming Contest
-1:May 30, 2016
#

original message
Vojwfstjuz pg Dpnqvufs Tuvejft, Zbohpo
Wpkxgtukva Rtqitcookpi Eqpvguv
Lzx 29, 1905


*/
/*
3:ACM ICPC Asia-Yangon 2016
5:Bachelor of Computer Science
7:Professional Programmers
#



3:ACM ICPC Asia-Yangon 2016
DFP LFSF Dvld-Bdqjrq 5349

5:Bachelor of Computer Science
Gfhmjqtw tk Htruzyjw Xhnjshj

7:Professional Programmers
Wyvmlzzpvuhs Wyvnyhttlyz
#

*/


