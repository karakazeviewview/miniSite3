public class lesson2{
	public static void main(String[] args){
		System.out.println("あなたの年齢を入力>");
		int age=new java.util.Scanner(System.in).nextInt();
		if(age>0&&age>18){
			System.out.println("あなたは大人です");
		}else if(age>0&&age<17){
			System.out.println("あなたは子供です");
		}else{
			System.out.println("不正な値です");
		}
	}
}
