引数にString型を１つ受け取りそれを*で装飾した文字列を返すメソッドを作成し、以下の処理を実現せよ
[実行例]
言葉>こんにちは
***こんにちは***

import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		int n=sumOf(3,5);
		System.out.println(n);
		System.out.print("言葉>");
		String str=new Scanner(System.in).next();
		String decorated=decorateStr(str);
		System.out.println(decorated);
	}
	//戻り値のあるメソッド
	static int sumOf(int a,int b){
		return a+b;
	}
	static String decorateStr(String s){
		return "***" + s + "***";
	}
}

