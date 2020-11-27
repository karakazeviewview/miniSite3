import java.util.*;
public class lesson86{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		int weight=new java.util.Scanner(System.in).nextInt();

		System.out.print("身長を入力してください(cm)>");
		int height=new java.util.Scanner(System.in).nextInt();
		double bmi=calcBMI(weight,height);
		
		System.out.print("体重:"+weight+"身長:"+height+"のBMIは"+bmi+"です");
	}
	public static double calcBMI(double weightKg,double heightCm){
		double heightM=heightCm/100;
		double bmi=weightKg/(heightM*heightM);
		return bmi;
	}
}
