Q5
名前を入力させ、それを出力する。
[実行例]
あなたのなまえを入力してください>田中[enter]
こんにちは田中さん！

public static void main(String[] args) {
		System.out.print("あなたのなまえを入力してください>");
		String name=new java.util.Scanner(System.in).nextLine();
		System.out.println("こんにちは" + name + "さん！");
	}