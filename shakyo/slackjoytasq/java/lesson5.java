public class lesson5{
	public static void main(String[] args){
		System.out.println("りんごの値段は？");
		int priceA=new java.util.Scanner(System.in).nextInt();
		System.out.println("りんごの個数は？");
		int quantityA=new java.util.Scanner(System.in).nextInt();
		System.out.println("バナナの値段は？");
		int priceB=new java.util.Scanner(System.in).nextInt();
		System.out.println("バナナの個数は？");
		int quantityB=new java.util.Scanner(System.in).nextInt();
		System.out.println("合計は"+(priceA*quantityA+priceB*quantityB)+"円です");
	}
}
