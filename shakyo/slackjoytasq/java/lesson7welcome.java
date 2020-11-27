お題
お名前> 山田 [enter]
年齢> 30 [enter]
ようこそ山田(30)さん！

public class Q1{
	public static void main(String[] args){
		System.out.print("お名前>");
		String name=
			new java.util.Scanner(System.in).nextLine();
		System.out.print("年齢>");
		int age=
			new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ"+name+"("+age+")さん!");
	}
}