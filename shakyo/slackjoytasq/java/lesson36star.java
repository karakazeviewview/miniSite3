Q7.for文を用いて以下のように表示せよ。
[実行結果]

ソースを表示印刷SyntaxHighlighterについて
*         *
*         *
*         *
*         *
*         *
*         *
*         *
*         *
*         *
**       **
**       **
**       **
**       **
**       **
**       **
**       **
***     ***
***     ***
***     ***
***     ***
***     ***
****   ****
****   ****
****   ****
***** *****

public class Q7{
  public static void main(String[] args){
    for(int i=5*5;i>0;i--){
      for(int j=5;j>=-5;j--){
        if(i<=j*j){
          System.out.print('*');
        }else{
          System.out.print(' ');
        }
      }
      System.out.println();
    }
  }
}