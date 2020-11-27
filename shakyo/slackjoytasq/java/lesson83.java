public class lesson83 {
  public static int max(int a, int b, int c) {
    int max = a;
    if(max < b) {
      max = b;
    }
    if(max < c) {
      max = c;
    }
    return max;
  }

  public static void main(String[] args) {
    int[] japaneseScore = new int[3];
    japaneseScore[0] = 84;
    japaneseScore[1] = 92;
    japaneseScore[2] = 76;

    int maxJapaneseScore = max(japaneseScore[0], japaneseScore[1], japaneseScore[2]);

    System.out.println("国語の最大点数は" + maxJapaneseScore + "点です。");
  }
}
import java.util.*;
  2 public class lesson83{
  3   public static void main(String[] args){
  4     System.out.println("整数a>");
  5     int num1=new java.util.Scanner(System.in).nextInt    ();
  6     System.out.pringln("整数b>");
  7     int num2=new java.util.Scanner(System.in).nextInt    ();
  8     System.out.println(numLarger(larger));
  9   }
 10   public static int numLarger(int a,int b){
 11     int larger=a;
 12     if(larger<b){
 13       larger=b;
 14     }
 15     retrun larger;
 16   }
 17 }
