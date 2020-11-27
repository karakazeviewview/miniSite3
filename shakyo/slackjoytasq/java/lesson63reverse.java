char型の配列に'H','E','L','L','O'を格納し、その配列を逆順にせよ
[実行例]
[O,L,L,E,H]
:+1:
4

1 件の返信

matsuda  12日前
import java.util.*;
public class Arr5{
	public static void main(String[] args){
		char[] chars=new char[]{'H','E','L','L','O'};
		/*
		for(int i=chars.length-1;i>=0;i--){
			System.out.print(chars[i]);
		}
		*/
		for(int i=0;i<chars.length/2;i++){
			char temp=chars[i];
			chars[i]=chars[chars.length-1-i];
			chars[chars.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(chars));
	}
}