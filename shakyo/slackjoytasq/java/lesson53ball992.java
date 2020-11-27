1~99の番号のついたボールが計99個入っている袋がある。
その中から2人が交互にボールを取り出し大きい数を引いた方が勝ちとなる。
ゲームは５回戦で競う。
なお、取り出したボールは袋に戻さないものとする(同じボールを二度ひくことはない)

詳しくは以下の実行例を参考にすること。
[実行例]

1回戦
A:62,B:9…Aの勝ち
2回戦
A:41,B:76…Bの勝ち
3回戦
A:79,B:27…Aの勝ち
4回戦
A:36,B:34…Aの勝ち
5回戦
A:96,B:71…Aの勝ち
4対1でAの勝ち

[解答例2]
こういった問題は最初に配列自体をソートしたりシャッフルしたりしてしまったほうが処理を簡単に掛ける場合が多い。下の解答例は配列を最初にシャッフルした。

　
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		final int GAMES=5;//ゲーム回数
		final int BALL_NUM=99;//ボールの個数
		/*ボール配列生成*/
		int[] balls=new int[BALL_NUM];
		for(int i=0;i<BALL_NUM;i++){
			balls[i]=i+1;
		}
		/*ボール配列シャッフル*/
		for(int i=0;i<balls.length;i++){
			int index=new Random().nextInt(balls.length-i);
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
		int aWin=0,bWin=0;//勝ち星管理の変数(for文の外でも利用するので宣言はここ)
		//ゲーム回数分ループ
		for(int i=0;i<GAMES;i++){
			System.out.println(i+1+"回戦");
			//配列の先頭から順番に取っていく
			int ballA=balls[i*2];
			int ballB=balls[i*2+1];
			String winner;
			if(ballA>ballB){
				winner="A";
				aWin++;
			}else{
				winner="B";
				bWin++;
			}
			System.out.printf("A:%d,B:%d…%sの勝ち%n", ballA,ballB,winner);
		}
		System.out.printf("%d対%dで%sの勝ち%n", Math.max(aWin, bWin),Math.min(aWin, bWin),aWin>bWin?"A":"B");
	}
}