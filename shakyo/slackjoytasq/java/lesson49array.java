1.int型の配列を宣言と同時に{4,8,10}で初期化せよ。(配列変数名:arrA)
2.int型の配列を宣言と同時にnew int[]{7,1,3}で初期化せよ。(配列変数名:arrB)
3.for文でarrAの値をすべて出力せよ。
4.拡張for文を使ってarrBの値をすべて出力せよ。
5.要素数が３のint型配列を宣言せよ。(配列変数名:arrC)
6.for文を使ってarrCの要素それぞれにarrAの要素を２倍した値を代入せよ。(結果arrCは[8,16,20]となる)
7.arrCの内容が[8,16,20]になってることをArrays.toStringを使って使って確認せよ。
8.for文を使ってarrCの要素それぞれにarrBの要素を加えよ。(結果arrCは[15,17,23]となる)
9.arrCの内容が[15,17,23]になってることをArrays.toStringを使って使って確認せよ。
10.合計を管理するint型の整数sumを宣言し、０で初期化する。
11.拡張for文を用いてarrCの値の合計を求める。
12.arrCの合計を「合計は55です。」という形式で出力する。

[解答例]

import java.util.Arrays;
public class ArrLesson2 {
	public static void main(String[] args) {
		//1
		int[] arrA = { 4, 8, 10 };
		//2
		int[] arrB = new int[] { 7, 1, 3 };
		//3
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		//4
		for (int n : arrB) {
			System.out.println(n);
		}
		//5
		int[] arrC = new int[3];
		//6
		for (int i = 0; i < arrC.length; i++) {
			arrC[i] = arrA[i] * 2;
		}
		//7
		System.out.println(Arrays.toString(arrC));
		//8
		for(int i=0;i<arrC.length;i++){
			arrC[i]=arrC[i]+arrB[i];
		}
		//9
		System.out.println(Arrays.toString(arrC));
		//10
		int sum=0;
		//11
		for(int n:arrC){
			sum+=n;
		}
		//12
		System.out.println("合計は"+sum+"です。");
	}
}

