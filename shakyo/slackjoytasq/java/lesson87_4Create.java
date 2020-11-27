public class lesson87_4Create{
	public static void main(String[] args){
		int[] testScore=new int[3];
	 	testScore[0]=83;
		testScore[1]=54;
		testScore[2]=98;

		int sumTestScore=sum(testScore[0],testScore[1],testScore[2]);

		System.out.println("今回のテストの合計点は"+sumTestScore);

		int maxTestScore=max(testScore[0],testScore[1],testScore[2]);

		System.out.println("最高点は"+maxTestScore);
	
		double aveTestScore=ave(testScore[0],testScore[1],testScore[2]);

		System.out.println("平均点は"+aveTestScore+"です");
	}

	public static int sum(int a,int b, int c){
		int sum=a+b+c;
		return sum;
	}
	public static int max(int a,int b, int c){
		int max=a;
		if(max<b){
			max=b;
		}else if(max<c){
			max=c;
		}
		return max;
	}

	public static double ave(int a,int b,int c){
		int ave=(a+b+c)/3;
		return ave;
	}
}
