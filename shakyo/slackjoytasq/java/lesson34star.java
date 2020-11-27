Q5.for文を用いて以下のように表示せよ。
[実行結果]
*************************
****************
*********
****
*

*
****
*********
****************
*************************

public class Q5{
  public static void main(String[] args){
    for(int i=5;i>=-5;i--){
      for(int j=0;j<i*i;j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}