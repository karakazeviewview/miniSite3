Q3.
0~99の乱数を100個配列に格納する。
最初に77が登場したindexを表示する。
[実行例]
33,1,5,8,........77....3,
最初の77のindexは81です。
[実行例]
77,1,5,8,........77....3,
最初の77のindexは0です。
[実行例]
33,1,5,8,............3,
77はありませんでした。

import java.util.*;
public class Arr3{
	public static void main(String[] args){
		int[] nums=new int[100];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(100);
			System.out.print(n+",");
			nums[i]=n;
		}
		System.out.println();
		int target=77;
		int i=0;
		for(;i<nums.length;i++){
			if(nums[i]==target){
				System.out.printf("最初の%dのindexは%dです。%n",target,i);
				break;
			}
		}
		if(i==nums.length){
			System.out.println("77はありませんでした。");
		}
	}
}