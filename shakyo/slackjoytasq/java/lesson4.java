public class lesson4{
	public static void main(String[] args){
		int score=new java.util.Random().nextInt(100);
		System.out.println(score+"でした");
		if(score>0&&score>=80){
			System.out.println(score+"は優です");
		}else if(score>0&&score>=60){
			System.out.println(score+"は良です");
		}else if(score>0&&score>=40){
			System.out.println(score+"は可です");
		}else if(score>0&&score<=39){
			System.out.println(score+"は不可です");
		}else{
			System.out.println("不正な値です");
		}
	}
}
