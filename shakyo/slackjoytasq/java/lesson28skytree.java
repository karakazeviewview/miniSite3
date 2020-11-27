Q6
スカイツリーの高さを入力させ、それがあっていれば「OK!」間違っていれば「NG」と表示する。
[実行例]
スカイツリーの高さは？(m)>634[enter]
OK!

public class Q6 {
	public static void main(String[] args) {
		System.out.print("スカイツリーの高さは？(m)>");
		int answer=new java.util.Scanner(System.in).nextInt();
		if(answer == 634){
			System.out.println("OK!");
		}else{
			System.out.println("NG");
		}
	}
}