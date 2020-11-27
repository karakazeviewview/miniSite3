Q2.for文を用いて以下のように表示せよ。
[実行結果]
*****
*****
*****

public class Q2{
  public static void main(String[] args){
    for(int i=0;i<3;i++){
      for(int j=0;j<5;j++){
        System.out.print('*');
      }
      System.out.println();
    }    
  }
}