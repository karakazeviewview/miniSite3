import java.util.Arrays;
public class ArrLesson3 {
	public static void main(String[] args) {
		// 宣言と同時なら{}での代入OK
		int[] dataA = { 3, 5, 10 };
		// こういった書き方もある
		int[] dataB = new int[] { 4, 6, 10 };
		// 配列の要素を全部回すパターン1
		for (int i = 0; i < dataA.length; i++) {
			System.out.println(dataA[i]);
		}
		// 配列の要素を全部回すパターン2(拡張for文)
		for (int n : dataB) {
			System.out.println(n);
		}
		// 配列の内容を出力([3,5,10]と出力される)
		System.out.println(Arrays.toString(dataA));
	}
}