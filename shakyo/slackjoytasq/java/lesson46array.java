public class ArrLesson1 {

	public static void main(String[] args) {
		//配列の宣言と初期化。要素数が３の配列が作られそれぞれが0で初期化される
		int[] nums=new int[3];
		System.out.println(nums.length); //3(要素数は3)
		//indexは0から始まることに注意
		System.out.println(nums[0]); //0
		System.out.println(nums[1]); //0
		System.out.println(nums[2]); //0
		
		//値を入れる
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//nums[3]=40;(エラーindexは0~2までしかない)
		
		//値を見る
		System.out.println(nums[0]); //10
		
		//配列の値の取り出しと代入(20+30の結果がnums[0]に代入される)
		nums[0]=nums[1]+nums[2];
		System.out.println(nums[0]); //50
				
	}
}
