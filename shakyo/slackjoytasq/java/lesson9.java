public class lesson9{
	public static void main(String[] args){
		System.out.println("あなたの性別を入れてください(男,女)>");
		String sex=new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください>");
		int age=new java.util.Scanner(System.in).nextInt();
		if((sex.equals("男")&&age>=18)||(sex.equals("女")&&age>=16)){
			System.out.println("あなたは結婚できます");
		}else{
			System.out.println("あなたは結婚できません");
		}
	}
}
