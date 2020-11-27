Q.
doubleで底辺と高さの値を引数として受取り、三角形の面積を表示するメソッドを作成せよ。
それを利用し、以下のアプリケーションを作成せよ。(小数点の表示は2桁とすること）
[実行例]
****TriangleCalculator****
どうする？1…三角形の面積を求める 0…やめる>1
底辺を入力してください>2.5
高さを入力してください>3.4
底辺:2.50,高さ:3.40の三角形の面積は4.25です。
どうする？1…三角形の面積を求める 0…やめる>1
底辺を入力してください>2.543
高さを入力してください>5.321
底辺:2.54,高さ:5.32の三角形の面積は6.77です。
どうする？1…三角形の面積を求める 0…やめる>0
アプリケーションを終了します。

import java.util.*;
public class Triangle{
	public static void main(String[] args){
		System.out.println("****TriangleCalculator****");
		while(true){
			System.out.print("どうする?1...三角形の面積を求める、0...やめる>");
			int select=new Scanner(System.in).nextInt();
			if(select == 0){
				break;
			}
			System.out.print("底辺を入力してください>");
			double bottom=new Scanner(System.in).nextDouble();
			System.out.print("高さを入力してください>");
			double height=new Scanner(System.in).nextDouble();
			double area=calcTriangleArea(bottom,height);
			System.out.printf("底辺:%.2f,高さ:%.2fの三角形の面積は%.2fです。%n",bottom,height,area);
		}
		System.out.println("アプリケーションを終了します。");
	}
	static double calcTriangleArea(double bottom,double height){
		double area=bottom * height / 2;
		return area;
	}
}