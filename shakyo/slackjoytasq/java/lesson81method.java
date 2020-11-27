２つのString型の引数を受け取り
どちらの文字数が多いかを判定し出力するメソッドを作成し、以下の処理を実現せよ。
[実行例]
言葉1>もも
言葉2>さくらんぼ
さくらんぼの勝ち
[実行例]
言葉1>もも
言葉2>かき
引き分け

import java.util.*;
public class MethodLesson3{
	public static void main(String[] args){
		System.out.print("言葉1>");
		String s1=new Scanner(System.in).next();
		System.out.print("言葉2>");
		String s2=new Scanner(System.in).next();
		compareLength(s1,s2);
	}
	static void compareLength(String s1,String s2){
		if(s1.length() == s2.length()){
			System.out.println("引き分け");
		}else if(s1.length() > s2.length()){
			System.out.println(s1 + "の勝ち");
		}else{
			System.out.println(s2 + "の勝ち");
		}
	}
}