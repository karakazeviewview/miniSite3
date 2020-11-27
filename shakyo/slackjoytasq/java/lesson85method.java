Q.
引数で文字列と整数を受け取り、その文字を整数個並べた文字列を返却するメソッドを作成する。
またそれを利用して以下の処理を実現せよ。
[実行結果]
繰り返す文字>Hello
繰り返す回数>5
HelloHelloHelloHelloHello

import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.print("繰り返す文字>");
		String str=new Scanner(System.in).next();
		System.out.print("繰り返す回数>");
		int times=new Scanner(System.in).nextInt();;
		System.out.println(timesStr(str,times));
	}
	static String timesStr(String str,int times){
		String s="";
		for(int i=0;i<times;i++){
			s+=str;
		}
		return s;
	}
}