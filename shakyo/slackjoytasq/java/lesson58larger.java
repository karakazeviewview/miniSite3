Q1
配列arr1を4,6,1,8で作成する。
配列arr2を3,9,2,5で作成する。
配列arr3を上記２つの配列のそれぞれのインデックスを比較し大きい方の値で作成する。
そのarr3を出力する。
[実行例]
[4,9,2,8] 

import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] arr1={4,6,1,8};
		int[] arr2={3,9,2,5};
		int[] arr3=new int[4];
		for(int i=0;i<arr3.length;i++){
			if(arr1[i] > arr2[i]){
				arr3[i]=arr1[i];
			}else{
				arr3[i]=arr2[i];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}