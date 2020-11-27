bottomに4.3を代入、heightに5.4を代入して、三角形の面積を求めよ。
[実行例]
底辺:4.3,高さ:5.4の三角形の面積は:11.61

public class Q4 {
	public static void main(String[] args) {
		double bottom=4.3;
		double height=5.4;
		System.out.println("底辺:"+bottom+",高さ:"+height+"の三角形の面積は:"+(bottom*height/2));
	}
}