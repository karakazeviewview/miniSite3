import java.util.*;
public class lesson87{
	public static void main(String[] args){
		System.out.print("どうする?1…三角形の面積を求める 0…やめる>");
		double yesorno=new java.util.Scanner(System.in).nextDouble();
		System.out.print("底辺を入力してください>");
		double bottom=new java.util.Scanner(System.in).nextDouble();
		System.out.print("高さを入力してください>");
		double height=new java.util.Scanner(System.in).nextDouble();
		double area=calcTriangleArea(bottom,height);
		System.out.println("三角形の面積は"+area);
	}
	public static double calcTriangleArea(double bottom,double height){
		double area=bottom*height/2;
		return area;
	}
}
