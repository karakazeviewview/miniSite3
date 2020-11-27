public class lesson2_2{
	public static void main(String[] args){
		int num1=new java.util.Random().nextInt(6)+1;
		int num2=new java.util.Random().nextInt(6)+1;
		System.out.println("Aさんがサイコロを振ったよ "+num1);
		System.out.println("Bさんがサイコロを振ったよ "+num2);
		if(num1>num2){
			System.out.println("Aさんが勝ったよ");
		}else if(num1==num2){
			System.out.println("引き分けだよ");
		}else{
			System.out.println("Bさんが勝ったよ");
		}
	}
}
