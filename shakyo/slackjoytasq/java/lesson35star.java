Q6.for文を用いて以下のように表示せよ。
[実行結果]
*****
 ****
  ***
   **
    *

    public class Q6{
  public static void main(String[] args){
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(j<i){
          System.out.print(' ');
        }else{
          System.out.print('*');
        }
      }
      System.out.println();
    }
  }
}