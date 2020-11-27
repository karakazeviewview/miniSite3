1.要素数が5のint型配列(変数名:data)を宣言せよ。
2.先頭の要素を出力せよ。
3.要素数を出力せよ。
4.先頭の要素に100を代入せよ。
5.最後の要素に150を代入せよ。
6.index2の要素に120を代入せよ。
7.index2の要素の値からindex0の要素の値を引いたものをindex1の要素に代入せよ。
8.index1の要素を出力せよ。

[解答例]

public class ArrLesson2 {
	public static void main(String[] args) {
		//1
		int[] data=new int[5];
		//2
		System.out.println(data[0]);
		//3
		System.out.println(data.length);
		//4
		data[0]=100;
		//5
		data[data.length-1]=150; //data[4]=150でもよいがこういった表現も覚えること
		//6
		data[2]=120;
		//7
		data[1]=data[2]-data[0];
		//8
		System.out.println(data[1]);
	}
}