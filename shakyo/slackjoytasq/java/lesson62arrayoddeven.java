0~9の乱数を10個配列に入れる
その10個それぞれが偶数か奇数かを文字列の配列に入れる
[実行結果]
2,4,6,4,6,1,3,9,1,1,
[偶数,偶数,偶数....奇数,奇数] （編集済み） 
:+1:
13

1 件の返信

matsuda  12日前
import java.util.*;
public class Arr4{
	public static void main(String[] args){
		int[] nums=new int[10];
		String[] strs=new String[10];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(10);
			System.out.print(n+",");
			strs[i]=n % 2 == 0 ? "偶数":"奇数";
		}
		System.out.println();
		System.out.println(Arrays.toString(strs));
	}
}