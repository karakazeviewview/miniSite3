0~9の乱数が入った要素10の配列を作成する。
その配列を小さい順に並び替え出力する。
[実行例]
[0,0,1,3,4,6,6,6,8,9]
1 件の返信

matsuda  12日前
import java.util.*;
public class Arr6{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(10);
			nums[i]=n;
		}
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
						int temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}