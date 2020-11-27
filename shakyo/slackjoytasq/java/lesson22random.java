Q1
1~100の範囲で生成された乱数を当てるゲームを作成せよ。もっと上やもっと下といったヒントを出しつつ正解に導き、正解までの試行回数を表示する。
[実行例]
数当てゲーム！！
いくつかな?>50
もっと下だよ。
いくつかな?>25
もっと上だよ。
いくつかな?>37
もっと上だよ。
いくつかな?>45
正解!4回で正解しました。

public class NumberGame{
	public static void main(String[] args){
		System.out.println("数当てゲーム！！");
		int ran=new java.util.Random().nextInt(100)+1;
		int count=0;
		int num=0;
		while(num!=ran){
			count++;
			System.out.print("いくつかな>");
			num=new java.util.Scanner(System.in).nextInt();
			if(num<ran){
				System.out.println("もっと上だよ");
			}
			else if(num>ran){
				System.out.println("もっと下だよ");
			}
		}
		System.out.printf("正解!%d回で正解しました",count);
	}
}