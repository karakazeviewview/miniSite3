あなたの性別をいれてください(男,女)>男 [enter]
あなたの年齢を入力してください>30 [enter]
あなたは結婚できます。
public class Lesson2{
	public static void main(String[] args){
		System.out.print("あなたの性別を入れてください(男,女)>");
		String gender=new java.util.Scanner(System.in).next();
		System.out.print("あなたの年齢をいれてください>");
		int age=new java.util.Scanner(System.in).nextInt();
		if(gender.equals("男") && age >= 18
				||
			gender.equals("女") && age >=16){
				System.out.println("あなたは結婚できます");
			}else{
				System.out.println("あなたは結婚できません");
			}
	}
}