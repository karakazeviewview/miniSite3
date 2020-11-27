public class lesson7{
	public static void main(String[] args){
		System.out.println("お名前>");
		String name=new java.util.Scanner(System.in).next();
		System.out.println("年齢>");
		int age=new java.util.Scanner(System.in).nextInt();
		System.out.printf("ようこそ%s(%d)さん!",name,age);
	}
}
