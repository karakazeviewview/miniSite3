Q3
野球のスコアボードを作成せよ。点数は以下の確率のランダムとする。
（延長戦は考慮しなくてよい）

[点数の確率]
0...70%
1...20%
2...5%
3...3%
4...2%
[実行例]

[実行例1]
G|000|000|010|1
T|011|000|00x|2
[実行例2]
G|000|000|030|3
T|011|000|003|5
[実行例３]
G|000|000|000|0
T|000|000|000|0
[解答例]

public class Ex3{
	public static void main(String[] args){
		int gTotal=0;
		int tTotal=0;
		for(int i=0;i<2;i++){
			if(i==0){
				System.out.print("G|");
			}else{
				System.out.print("T|");
			}
			for(int j=0;j<9;j++){
				if(i==1 && j== 8 && tTotal>gTotal){
					System.out.print('x');
				}else{
					int n=new java.util.Random().nextInt(100);
					int score;
					if(n<70){
						score=0;
					}else if(n < 90){
						score=1;
					}else if(n < 95){
						score=2;
					}else if(n < 98){
						score=3;
					}else{
						score=4;
					}
					System.out.print(score);
					if(i==0){
						gTotal+=score;
					}else{
						tTotal+=score;
					}
				}
				if((j+1)%3 == 0){
					System.out.print('|');
				}
				if(j==8){
					if(i==0){
							System.out.println(gTotal);
					}else{
							System.out.println(tTotal);
					}
				}
			}
		}
	}
}