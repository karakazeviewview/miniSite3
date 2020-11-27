Q1
階段の高さを入力すると、その高さの階段を描画する処理を作成せよ。
[実行例]

何段>5
    *
   **
  ***
 ****
*****
[解答例]

public class Ex1{
	public static void main(String[] args){
		System.out.print("何段>");
		int n=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j>=n-1-i){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}