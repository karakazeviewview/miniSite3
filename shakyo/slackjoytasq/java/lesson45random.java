乱数を使って簡単なゲームを作成してみよう。
くじを３回引いて獲得賞金を競うものだ。
1~100までの乱数を発生させて
もし1だったら１等ということで1000万円
もし2か3だったら2等ということで100万
同様に4,5,6だったら３等10万
7,8,9,10だったら４等1万
11~20だったら５等1000円
21~40だったら6等100円
それ以外はハズレだ。
このくじを３回引いた獲得賞金を求めてみよう。
[実行例]
1回目
55
ハズレ
2回目
5
10万円
3回目
30
100円
獲得賞金は
100,100円でした！ （編集済み） 
:+1:
5


matsuda  13:44
public class Lottery{
	public static void main(String[] args){
		int count=3;
		int sum=0;
		for(int i=0;i<count;i++){
			System.out.println(i+1+"回目");
			int num = new java.util.Random().nextInt(100)+1;
			System.out.println(num);
			if(num == 1){
				System.out.println("1000万円");
				sum += 10000000;
			}else if(num < 4){
				System.out.println("100万円");
				sum += 1000000;
			}else if(num < 7){
				System.out.println("10万円");
				sum += 100000;
			}else if(num < 11){
				System.out.println("1万円");
				sum += 10000;
			}else if(num < 21){
				System.out.println("1000円");
				sum += 1000;
			}else if(num < 41){
				System.out.println("100円");
				sum += 100;
			}else{
				System.out.println("ハズレ");
			}
		}
		System.out.println("獲得賞金は");
		System.out.printf("%,d円でした!%n",sum);
	}
}