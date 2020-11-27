import java.util.*;
public class lesson81{
	public static void main(String[] args){
		System.out.println("言葉1>");
		String word1=new java.util.Scanner(System.in).nextLine();
		System.out.println("言葉2>");
		String word2=new java.util.Scanner(System.in).nextLine();
		compareLength(word1,word2);
	}
	static void compareLength(String word1,String word2){
		if(word1.length()==word2.length()){
			System.out.println("引き分け");
		}else if(word1.length()>word2.length()){
 			System.out.println(word1+"の勝ち");
	 	}else{
			System.out.println(word2+"の勝ち");
		}
	}
}


