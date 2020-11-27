地球の半径は6371kmである。
今地球を一本の長いロープでぐるっと囲ったとする。
Q1 ロープの長さは何mか小数点１桁で求めよ
Q2 今このロープの長さを10m延長した。同じようにぐるっと地球を囲った場合地球との隙間は何mなのかを小数点１桁で求めよ。
なお、円周の求め方は2 * 円周率 * 半径である。
(円周率はMath.PIを使うこと) 

public class JavaQ{
	public static void main(String[] args){
		final double  EARTH_R= 6371.0* 1000 ;
		double rope= EARTH_R * 2 * Math.PI;
		System.out.printf("ロープは%.1fm%n",rope);
		double diff = 5 / Math.PI;
		System.out.printf("地球との隙間は %.1fmです。%n",diff);
	}
}