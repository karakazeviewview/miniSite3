袋の中に１～５の番号がついたボールが入っている。この袋からボールがなくなるまでランダムに取り出す。
そのときの番号を表示せよ
[実行例1]
3
1
4
5
2
[実行例2]
4
1
3
2
5 

import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false};
		for(int i=0;i<5;i++){
			while(true){
				int index=new Random().nextInt(balls.length);
				if(isPicked[index]){
					continue;
				}
				System.out.println(balls[index]);
				isPicked[index]=true;
				break;
			}
		}
	}
}