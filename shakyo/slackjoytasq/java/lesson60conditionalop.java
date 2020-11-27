Q1
２つの数値を読み込んでその小さい方の値を表示せよ。
[実行例]
整数A:3 ［エンター]
整数B:5 [エンター]
小さい方の数は3です。
[解答例]

import java.util.Scanner;
public class Jn1_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("整数A:");
		int a=scan.nextInt();
		System.out.print("整数B:");
		int b=scan.nextInt();
		int min=a<b ? a:b;
		System.out.println("小さい方の数は"+min+"です。");
		scan.close();
	}
}