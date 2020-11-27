Q2
点数を入力するとその点数分*を描画する処理を作成せよ。
もし、0~100の範囲外の点数が入力されたら再入力させること

[実行例]

[実行例1]
何点>200 [enter]
点数は0から100です
何点>-20 [enter]
点数は0から100です
何点>12 [enter]
*****|*****|**
[実行例2]
何点>10 [enter]
*****|*****|
[解答例]

public class Ex2{
	public static void main(String[] args){
		int score=0;
		while(true){
			System.out.print("何点>");
			score=new java.util.Scanner(System.in).nextInt();
			if(score < 0 || score >100){
				System.out.println("点数は0から100です");
				continue;
			}
			break;
		}
		for(int i=0;i<score;i++){
			System.out.print('*');
			if( (i+1) % 5 == 0){
				System.out.print('|');
			}
		}
		System.out.println();
	}
}