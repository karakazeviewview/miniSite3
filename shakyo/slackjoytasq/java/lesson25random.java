Q3
1~10の乱数を生成して、それが偶数か奇数かを判定

[実行例]
8は偶数(even)

public class Q3 {
	public static void main(String[] args) {
		int num=new java.util.Random().nextInt(10)+1;
		if(num % 2 == 0){
			System.out.println(num+"は偶数(even)");
		}else{
			System.out.println(num+"は奇数(odd)");
		}
	}
}