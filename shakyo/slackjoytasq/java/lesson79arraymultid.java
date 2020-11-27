いつはいくつ>3;
いつをいれて>昨日
いつをいれて>明日
いつをいれて>遠い未来
誰がはいくつ>4;
誰がをいれて>私
誰がをいれて>ボノボ
誰がをいれて>猫
誰がをいれて>クリロナ
どこではいくつ>3;
どこでをいれて>公園
どこでをいれて>居酒屋
どこでをいれて>会議室
何をしたはいくつ>3;
何をしたをいれて>ダンス
何をしたをいれて>吐いた
何をしたをいれて>叫んだ
遠い未来猫が会議室でダンス

import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		String[] items={"いつ","誰が","どこで","何をした"};
		String[][] data=new String[items.length][];
		for(int i=0;i<data.length;i++){
			System.out.print(items[i]+"はいくつ>");
			int cont=new Scanner(System.in).nextInt();
			data[i]=new String[cont];
			for(int j=0;j<data[i].length;j++){
				System.out.print(items[i]+"をいれて>");
				String item=new Scanner(System.in).nextLine();
				data[i][j]=item;
			}
		}
		String[] seps={"","が","で",""};
		for(int i=0;i<data.length;i++){
			int index=new Random().nextInt(data[i].length);
			System.out.print(data[i][index]+seps[i]);
		}
		System.out.println();
	}
}