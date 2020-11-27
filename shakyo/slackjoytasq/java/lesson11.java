public class lesson11{
	public static void main(String[] args){
		System.out.println("月を入力>");
		int month=new java.util.Scanner(System.in).nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
			System.out.println(month+"は春です");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println(month+"は夏です");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println(month+"は秋です");
			break;
			case 12:
			case 1:
			case 2:
			System.out.println(month+"は冬です");
			break;
			default:
			System.out.println("不正な値です");
		}
	}
}
