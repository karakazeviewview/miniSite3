import java.util.*;
public class lesson87_2Create{
	public static void main(String[] args){
		String[] suits={"♠︎","♦︎","❤︎","♣︎"};
		String[] nums={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] deck=createDeck(suits,nums);
		showCards(deck);
	}

	public static String[] createDeck(String[] suits,String[] nums){
		String[] deck=new String[suits.length*nums.length];
		for(int i=0;i<deck.length;i++){
			deck[i]=suits[i/nums.length]+nums[i%nums.length];
		}
		return deck;
	}

	public static void showCards(String[] cards){
		for(int i=0;i<cards.length;i++){
			System.out.printf("%-5s",cards[i]);
			if((i+1)%13==0){
				System.out.println();
			}
		}
		System.out.println();
	}
}
