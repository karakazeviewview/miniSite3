小さい数>-4 [enter]
大きい数>10 [enter]
-4から10までたすと45です。
public class ForLesson3{
	public static void main(String[] args){
		System.out.println("小さい数>");
		int min=new java.util.Scanner(System.in).nextInt();
		System.out.println("大きい数>");
		int max=new java.util.Scanner(System.in).nextInt();
		int sum=0;
		for(int i=min;i<=max;i++){
			sum += i;
		}
		System.out.printf("%dから%dまで足すと%dです%n"
				,min,max,sum);
	}
}