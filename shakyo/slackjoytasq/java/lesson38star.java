Q9.キーボードからの入力に対し、それを高さとする菱形を描画する処理を実現せよ。
[実行例1]

正の奇数を入力>7
   *   
  * *  
 *   * 
*     *
 *   * 
  * *  
   *   
[実行例2]

ソースを表示印刷SyntaxHighlighterについて
正の奇数を入力>4
正の奇数を入力してください!
正の奇数を入力>-2
正の奇数を入力してください!
正の奇数を入力>5
  *  
 * * 
*   *
 * * 
  *  

public class Dia{
	public static void main(String[] args){
		int n=0;
		while(true){
			System.out.print("正の奇数を入力>");
			n=new java.util.Scanner(System.in).nextInt();
			if(n < 0 || n % 2 == 0){
				System.out.println("正の奇数を入力してください!");
				continue;
			}
			break;
		}
		int center=n/2;
		int offset=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==center + offset || j == center - offset){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			if(i < center){
				offset++;
			}else{
				offset--;
			}
			System.out.println();
		}
	}
}
