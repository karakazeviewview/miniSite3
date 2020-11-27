3行4列の配列を作成し表を出力せよ。
要素は1~100のランダム
その際、表示がずれないようにすること
[実行結果]
 21 100  44  20
  1  32  16  65
 32   9  20  55

 import java.util.*;
public class ArrLesson1{
	public static void main(String[] args){
		int[][] data=new int[3][4];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				int n=new Random().nextInt(100)+1;
				data[i][j]=n;
				System.out.printf("%4d",data[i][j]);
			}
			System.out.println();
		}
	}
}