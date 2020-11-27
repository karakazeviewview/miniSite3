問)
1~6の目がランダムに出るサイコロを１０回振り、その目を配列に格納してく。
そして、その結果を出力する。ただし出力フォーマットは実行例のようにすること
[実行例]
[1, 6, 1, 5, 4, 2, 1, 1, 4, 1]
解)

import java.util.Arrays;
import java.util.Random;

public class ArrTest {
	public static void main(String[] args) {
		Random rand=new Random();
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=rand.nextInt(6)+1;
		}
		System.out.println(Arrays.toString(nums));
	}
}