public class lesson2_3{
	public static void main(String[] args){
		int numA=new java.util.Random().nextInt(6)+1;
		int numB=new java.util.Random().nextInt(6)+1;
		int numC=new java.util.Random().nextInt(6)+1;
		System.out.println("Aさんがサイコロを振ったよ"+numA);
		System.out.println("Bさんがサイコロを振ったよ"+numB);
		System.out.println("Cさんがサイコロを振ったよ"+numC);
		if(numA>numB&&numA>numC){
			System.out.println("一番大きい目は"+numA+"だよ");
		}else if(numB>numA&&numB>numC){
			System.out.println("一番大きい目は"+numB+"だよ");
		}else{
			System.out.println("一番大きい目は"+numC+"だよ");
		}
	}
}
