public class lesson10{
	public static void main(String[] args){
		System.out.println("点数を入力>");
		int score=new java.util.Scanner(System.in).nextInt();
		if(score>=0&&score<=100){
			System.out.println("あなたの点数は"+score+"点です");
		}else{
			System.out.println("不適切な値が入力されました");
		}
	}
}
