import java.util.*;
public class lesson84{
	public static void main(String[] args){
		System.out.print("月を入力してください");
		int month=new java.util.Scanner(System.in).nextInt();
		System.out.println(month+"月の日数は"+getNumberOfDays(month)+"日です。");
	}

	public static int getNumberOfDays(int month){
		int days;
		switch(month){
		case 2:
			days=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		default:
			days=31;
		}
		return days;
	}
}
