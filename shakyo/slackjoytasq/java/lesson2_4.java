public class lesson2_4{
		public static void main(String[] args){
			int numA=new java.util.Random().nextInt(6)+1;
			int numB=new java.util.Random().nextInt(6)+1;
			System.out.println("Aさんがサイコロを振ったよ"+numA);
			System.out.println("Bさんがサイコロを振ったよ"+numB);
			if((numA+numB)%2==0){
				System.out.println("二人の目の和は偶数だったよ");
			}else{
				System.out.println("二人の目の和は奇数だったよ");
			}
		}
	}
