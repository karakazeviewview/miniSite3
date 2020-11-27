さくっとJava（出来た人はリアクションをお願いします)
0~99の乱数を繰り返し発生させ77がでるまでの回数を求めよ。
[実行例]
95
46
39
72
76
14
64
75
72
24
88
50
65
77
14回目に77が出ました!

public class Lucky{
	public static void main(String[] args){
		final int LUCKY=77;
		int no;
		int count=0;
		do{
			count++;
			no=new java.util.Random().nextInt(100);
			System.out.println(no);
		}while(no != LUCKY);
		System.out.printf("%d回目に%dが出ました%n",count,LUCKY);
	}
}