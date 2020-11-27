public class lesson15{
		public static void main(String[] args){
			int count=0;
			final long DIST=384400000000L;
			long thick=1L;
			while(thick<DIST){
				thick=thick*2;
				count++;
			}
			System.out.println(count+"回折り曲げたら月に到着します");
		}
	}
