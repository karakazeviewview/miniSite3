public class lesson16{
	public static void main(String[] args){
		final double radius=6371.0*1000;
		double rope=radius*2*Math.PI;
		System.out.printf("ロープは%.1fm%n",rope);
		double diff=5/Math.PI;
		System.out.printf("地球との隙間は%.1fmです。%n",diff);
	}
}
