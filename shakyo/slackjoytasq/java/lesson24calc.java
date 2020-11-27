Q2
xに10を代入し、それに５を３回足し結果を出力せよ。(whileと+=を使うこと)

[実行例]
Ans:25

public class Q2 {
	public static void main(String[] args) {
		int x=10;
		int count=3;
		while(count > 0){
			x += 5;
			count--;
		}
		System.out.println("Ans:"+ x);
	}
}