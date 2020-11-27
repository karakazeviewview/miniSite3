import java.util.*;
public class lesson85{
	public static void main(String[] args){
		System.out.print("繰り返す文字>");
		String str=new java.util.Scanner(System.in).nextLine();
		System.out.print("繰り返す回数");
		int times=new java.util.Scanner(System.in).nextInt();
		System.out.println(timesStr(str,times));
	}
public static String timesStr(String str,int times){
		String s="";
		for(int i=0;i<times;i++){
			s=s+str;
		}
		return s;
	}
}
