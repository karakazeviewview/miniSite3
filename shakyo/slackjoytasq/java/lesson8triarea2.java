お題Q2
底辺>10.5 [enter]
高さ>21.2 [enter]
底辺10.5,高さ21.2の三角形の面積は111.3です！
hint
少数の受け取りは
new java.util.Scanner(System.in).nextDouble()
で行えます

public class Q2{
	public static void main(String[] args){
		System.out.print("底辺>");
		double bottom=new java.util.Scanner(System.in).nextDouble();
		System.out.print("高さ>");
		double height=new java.util.Scanner(System.in).nextDouble();
		//System.out.println("底辺"+bottom+",高さ"+height+"の三角形の面積は"+(bottom*height/2)+"です!");
		System.out.printf("底辺%.1f,高さ%.1fの三角形の面積は%.1fです%n",bottom,height,bottom*height/2);
	}
}