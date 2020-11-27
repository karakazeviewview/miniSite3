配列とメソッドの理解はとても大切だ。今回は受講生(H氏)の作成した問題を元に配列とメソッドの理解を深めていこう！

今回のお題
参加人数とサイコロをそれぞれ何回振るかを入力してもらい目の合計が多い人が勝ちとなる。詳しくは以下の実行例を参照のこと

実行例
[実行例1]

何人>3
何回ふる>5
Aさん:[1, 4, 4, 6, 2] 合計:17
Bさん:[2, 1, 2, 1, 4] 合計:10
Cさん:[2, 3, 1, 1, 1] 合計:8
Aさんの勝ち
[実行例2]

何人>5
何回ふる>3
Aさん:[2, 2, 4] 合計:8
Bさん:[4, 6, 2] 合計:12
Cさん:[2, 1, 4] 合計:7
Dさん:[6, 3, 3] 合計:12
Eさん:[6, 1, 2] 合計:9
Bさん,Dさんの勝ち
[実行例３]

何人>3
何回ふる>3
Aさん:[5, 5, 1] 合計:11
Bさん:[2, 5, 4] 合計:11
Cさん:[1, 4, 6] 合計:11
引き分け
メソッド作成
今回はメソッド作成がテーマの一つなのでなるべく処理をメソッドに分けて作成していこう。

サイコロの出目が入った配列を返すメソッド
サイコロを何回振るのかという情報を受け取り、その回数分の出目の配列を作るとよさそうだ。

引数:int、戻り値:int[]

static int[] createDiceArr(int count){}

例) createDiceArr(3) //->[3,1,5]
[作例]

static int[] createDiceArr(int count){
    int[] diceArr=new int[count];
    for(int i=0;i<diceArr.length;i++){
      diceArr[i]=new Random().nextInt(6)+1;
    }
    return diceArr;
  }
メソッド内で配列をnewして、その中にダイスの目を詰めていっている。
（import java.util.*がしてある前提)
戻り値として配列を指定しているところがポイントだ。

サイコロの出目の和を求めるメソッド
サイコロの出目の合計が多い人の勝ちというゲームなので、これを求めるメソッドを作ろう。さきほどサイコロの出目配列を作れるようになったので配列の合計を求めるメソッドを作ればよさそうだ。

引数:int[] 戻り値: int

static int arrSum(int[] nums){}

例) arrSum(new int[]{1,2,3}) //->6
[作例]

static int arrSum(int[] nums){
	int sum=0;
	for(int n:nums){
		sum+=n;
	}
	return sum;
}
合計といったらsum=0を用意して足し込んでいくのがセオリーだ。
ここは拡張for文を使っていきたい。

連続したchar配列を作成するメソッド
入力された人数によって名前がA,B,C….という連続した値になっている。
この処理はJavaのchar型がintの側面をもっているという性質を利用するとうまくいく。

char c1='A';
char c2=(char)(c1+1); //->'B'
char c3=(char)(c1+2); //->'C'
この性質を利用しつつ、メソッドを作成していこう。
引数でどの文字から始めるのか、いくつ必要なのかを受け取るようにするとよいだろう。

引数:(char , int) 、戻り値:char[]

static char[] createAlphArr(char first,int num){}

例) createAlphArr('A',3) //->['A','B','C']
[作例]

static char[] createAlphArr(char first,int num){
	char[] alphArr=new char[num];
	for(int i=0;i<alphArr.length;i++){
		alphArr[i]=(char)(first+i);
	}
	return alphArr;
}
Javaのchar型がintの性質をもっていることを利用してうまいことループで処理することができた。この文字を連続で作るテクニックはときどき出てくるので知っておくとよいだろう。

配列の要素がすべて同じかを調べるメソッド
ここまでの処理で配列の生成や合計などが求められそうなので、後は勝敗の判定部分を作っていこう。全員の合計が等しいときに「引き分け」となるので配列の要素が等しいかどうかを判定するメソッドを作成する。

引数:int[] 、戻り値:boolean

static boolean isSame(int[] nums){}

例) isSame(new int[]{2,2}) //->true
[作例]

static boolean isSame(int[] nums){
	int first=nums[0];
	for(int i=1;i<nums.length;i++){
		if(nums[i] != first){
			return false;
		}
	}
	return true;
}
戻り値としてbooleanを指定するメソッドもよく登場する。この場合isXXXという命名ルールがよく用いられる。
また今回やったような、最初の一つをまず取得して残りと比較していくアルゴリズムも大切なのでしっかりと覚えよう。

配列の中の最大値を求めるメソッド
先程のメソッドで引き分けかどうかを判定できるので後は勝者を求める方法を考えればよい。実行例2を見ると最高得点が複数人いた場合ともに勝者となることがわかる。
配列の中の最大値を求めるメソッドを作成しておけば勝者を判定できそうだ。

引数:int[] ,戻り値:int

static int maxNum(int[] nums){}

例) maxNum(new int[]{2,1,5}) //->5
[作例]

static int maxNum(int[] nums){
	int max=nums[0];
	for(int i=1;i<nums.length;i++){
		if(nums[i] > max){
			max=nums[i];
		}
	}
	return max;
}
最大値を求めるアルゴリズムだ。こういったお決まりの手法を一つ一つ覚えていくことでプログラマーとしての筋が良くなっていく。

実際のダイスゲーム作成
これでこのゲームに必要そうな主要な処理はメソッドして作成できた。
あとは実行例を見ながら落とし込んでいこう。

[実行例1]

何人>3
何回ふる>5
Aさん:[1, 4, 4, 6, 2] 合計:17
Bさん:[2, 1, 2, 1, 4] 合計:10
Cさん:[2, 3, 1, 1, 1] 合計:8
Aさんの勝ち
[実行例2]

何人>5
何回ふる>3
Aさん:[2, 2, 4] 合計:8
Bさん:[4, 6, 2] 合計:12
Cさん:[2, 1, 4] 合計:7
Dさん:[6, 3, 3] 合計:12
Eさん:[6, 1, 2] 合計:9
Bさん,Dさんの勝ち
[実行例３]

何人>3
何回ふる>3
Aさん:[5, 5, 1] 合計:11
Bさん:[2, 5, 4] 合計:11
Cさん:[1, 4, 6] 合計:11
引き分け
[作例]

import java.util.*;
public class Main{
	public static void main(String[] args){
		//プレイヤー作成
		System.out.print("何人>");
		int personNum=new Scanner(System.in).nextInt();
		char[] players=createAlphArr('A',personNum);
		//プレイヤーごとの合計点を管理する配列
		int[] sums=new int[players.length];
		//ダイスの目作成
		System.out.print("何回ふる>");
		int count=new Scanner(System.in).nextInt();
		for(int i=0;i<players.length;i++){
			int[] diceArr=createDiceArr(count);
			sums[i]=arrSum(diceArr);
			System.out.printf("%sさん:%s 合計:%d%n",players[i],Arrays.toString(diceArr),sums[i]);
		}
		//結果判定
		if(isSame(sums)){
			System.out.println("引き分け");
		}else{
			int maxNum=maxNum(sums);
			String str="";
			for(int i=0;i<sums.length;i++){
				if(sums[i]==maxNum){
					str+=players[i]+"さん,";
				}
			}
			//最後の,を削除する処理
			str=str.substring(0,str.length()-1);
			//結果出力
			System.out.println(str+"の勝ち");
		}
	}
	static int[] createDiceArr(int count){
		int[] diceArr=new int[count];
		for(int i=0;i<diceArr.length;i++){
			diceArr[i]=new Random().nextInt(6)+1;
		}
		return diceArr;
	}
	static int arrSum(int[] nums){
		int sum=0;
		for(int n:nums){
			sum+=n;
		}
		return sum;
	}
	static char[] createAlphArr(char first,int num){
		char[] alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i]=(char)(first+i);
		}
		return alphArr;
	}
	static boolean isSame(int[] nums){
		int first=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i] != first){
				return false;
			}
		}
		return true;
	}
	static int maxNum(int[] nums){
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i] > max){
				max=nums[i];
			}
		}
		return max;
	}
}
先に必要となりそうな処理をメソッドとして作っておいたのでメインメソッドの見通しがよくなっている。

まとめ
今回は配列とメソッドの演習問題ということで数多くのメソッドを作成した。少し難しかったところもあったと思うがプログラミングのエッセンスが濃縮されている。繰り返し演習してもらいたい。