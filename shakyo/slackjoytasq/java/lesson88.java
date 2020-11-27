import java.util.*;
public class lesson88{
	public static void main(String[] args){
		if(args.length==0){
			System.out.println("コマンドライン引数はありません");
		}else{
			int sum=0;
			for(String s:args){
				sum=sum+Integer.parseInt(s);
			}
			System.out.println("コマンドライン引数の合計は"+sum+"です");
		}
	}
}
