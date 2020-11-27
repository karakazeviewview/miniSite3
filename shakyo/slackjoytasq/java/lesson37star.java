Q8.キーボードからの入力に対し、それを段数とするピラミッドを描画する処理を実現せよ。
[実行例1]

ソースを表示印刷SyntaxHighlighterについて
何段のピラミッドをつくる？>5
    *
   ***
  *****
 *******
*********

public class Jn25{
  public static void main(String[] args){
    System.out.print("何段のピラミッドを作る?>");
    int num=new java.util.Scanner(System.in).nextInt();
    //何行？->入力された数(5と仮定)
    for(int i=0;i<num;i++){
      //何列?->0行目5,1行目6,2行目7つまりnum+i
      for(int j=0;j<num+i;j++){
        //空白何個？->0行目4,1行目3,2行目2つまりnum-1-i
        if(j<num-1-i){
          System.out.print(' ');
        }else{
          System.out.print('*');
        }
      }
      //列の出力が終わったら改行
      System.out.println();
    }
  }
}