package tw.org.iii.tutor;

public class poker {

	public static void main(String[] args) {
		int poker [] = new int [52];
		String pokerCards [] = new String [52];
		String playerA [] = new String [13];String playerB [] = new String [13];String playerC [] = new String [13];String playerD [] = new String [13];
		int card1 = 0;
		int card2 = 0;
		int temp = 0 ;
	//做牌	
		for(int i = 0; i < 52; i++) {
			poker[i] = i+1;
						
		}
	//洗牌
		for(int times = 0; times < 10000; times++) {
			card1 = (int)(Math.random()*52);
			card2 = (int)(Math.random()*52);
			temp = poker[card1];
			poker[card1] = poker[card2];
			poker[card2]=temp;
		}
	//加上花色
		for(int i = 0; i < 52; i++) {	
			if(poker[i]/13 == 0 || poker[i] == 13) {
				pokerCards[i] = "黑桃"+poker[i];			
			}else if(poker[i]/13 == 1 || poker[i] == 26) {
				if(poker[i] == 26) {
					pokerCards[i] = "紅心13";
				}else {
					pokerCards[i] = "紅心"+poker[i]%13;								
				}
			}else if(poker[i]/13 == 2 || poker[i] == 39) {
				if(poker[i] == 39) {
					pokerCards[i] = "方塊13";
				}else {
					pokerCards[i] = "方塊"+poker[i]%13;								
				}
			}else {
				if(poker[i] == 52) {
					pokerCards[i] = "梅花13";
				}else {
					pokerCards[i] = "梅花"+poker[i]%13;								
				}
			}
						
		}
		
		//開牌
//		for(int i = 0; i < 52; i++) {	
//			System.out.println(pokerCards[i]);		
//		}
		
		//發牌
		System.out.println("玩家A的牌 : ");
		System.out.println();
		
		for(int i = 0; i < 13; i++) {
				playerA[i] = pokerCards[i];
				System.out.println(playerA[i]);
		}
		System.out.println();
		System.out.println("玩家B的牌 : ");
		System.out.println();
		
		for(int i = 13; i < 26; i++) {
			playerB[i-13] = pokerCards[i];
			System.out.println(playerB[i-13]);
		}		
		System.out.println();
		System.out.println("玩家C的牌 : ");
		System.out.println();
		
		for(int i = 26; i < 39; i++) {
			playerC[i-26] = pokerCards[i];
			System.out.println(playerC[i-26]);
		}
		System.out.println();
		System.out.println("玩家D的牌 : ");
		System.out.println();
		
		for(int i = 39; i < 52; i++) {
			playerD[i-39] = pokerCards[i];
			System.out.println(playerD[i-39]);
		}

		

				
 
	}

}
