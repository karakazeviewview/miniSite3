Q.
1.身長(cm)と体重(kg)をdouble型の引数で受け取りBMIを返すメソッドを作成せよ。
static double calcBMI(double weightKg,double heightCm){
処理
}
なおBMIは
体重(kg)/(身長(m)*身長(m))
で求められる。
2.実行すると以下の処理になるようにメインメソッドを作成せよ。
体重を入力してください(kg)>70.2
身長を入力してください(cm)>175.3
体重:70.2kg,身長:175.3cmのBMIは22.8です。

import java.util.*;
public class BMIApp {
	//体重と身長を受け取り、bmiを返すメソッド
	static double calcBMI(double weightKg,double heightCm){
		//cmからmに変換
		double heightM=heightCm/100;
		//bmiの計算
		double bmi=weightKg/(heightM*heightM);
		return bmi;
	}
	static void main(String[] args) {
		System.out.print("体重を入力してください(kg)>");
		double weight=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=new Scanner(System.in).nextDouble();
		//calcBMIを呼び出した結果をbmiに代入
		double bmi=calcBMI(weight,height);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。",weight,height,bmi);
	}
}