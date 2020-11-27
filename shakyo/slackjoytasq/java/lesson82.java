import java.util.*;
public class lesson82{
	public static void main(String[] args){
		System.out.println("言葉>");
		String word=new java.util.Scanner(System.in).nextLine();
		String decorated=decorateWord(word);
		System.out.println(decorated);
	}
	public static String decorateWord(String w){
		return "***"+w+"***";
	}
}
	
