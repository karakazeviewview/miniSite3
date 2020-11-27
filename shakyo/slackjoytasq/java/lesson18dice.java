サイコロを何回ふる>3 [enter]
5
2
3
合計は10
最小は2
最大は5
平均は3.3
public class JavaMax{
	public static void main(String[] args){
		System.out.print("サイコロを何回ふる>");
		int num=new java.util.Scanner(System.in).nextInt();
		int sum=0;
		int min=6;
		int max=1;
		for(int i=0;i<num;i++){
			int dice=new java.util.Random().nextInt(6)+1;
			System.out.println(dice);
			sum+=dice;
			if(min > dice){
				min=dice;
			}
			if(max < dice){
				max=dice;
			}
		}
		System.out.printf("合計%d%n",sum);
		System.out.printf("最小%d%n",min);
		System.out.printf("最大%d%n",max);
		System.out.printf("平均%.1f%n",(double)sum/num);
	}
}