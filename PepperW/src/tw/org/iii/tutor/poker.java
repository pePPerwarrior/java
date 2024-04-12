package tw.org.iii.tutor;

import java.util.Arrays;

public class poker {

	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
		int poker [] = new int [52];
//		String pokerCards [] = new String [52];
		String playerAA[] = new String [13];String playerBB [] = new String [13];String playerCC [] = new String [13];String playerDD [] = new String [13];
		int playerA [] = new int [13];int playerB [] = new int [13];int playerC [] = new int [13];int playerD [] = new int [13];
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
		
	//發牌v2
			
		for(int i = 0 ; i < 52; i++ ) {
			if(i<13) {
				playerA[i] = poker[i];
			}else if(i<26) {
				playerB[i-13] = poker[i];
			}else if(i<39) {
				playerC[i-26] = poker[i];
			}else {
				playerD[i-39] = poker[i];
			}
		}
	// sort 排序
		
		Arrays.sort(playerA);
		Arrays.sort(playerB);
		Arrays.sort(playerC);
		Arrays.sort(playerD);
		
	// A hand 
		for(int i =0 ; i<13; i++) {
			int t = playerA[i];
			if(t<14) {
				playerAA[i] = "黑桃"+playerA[i];
			}else if(t<27) {
				playerAA[i] = "紅心"+(playerA[i]-13);
			}else if(t<40) {
				playerAA[i] = "方塊"+(playerA[i]-26);
			}else {
				playerAA[i] = "梅花"+(playerA[i]-39);
			}
		}
	// B hand
		for(int i =0 ; i<13; i++) {
			int t = playerB[i];
			if(t<14) {
				playerBB[i] = "黑桃"+playerB[i];
			}else if(t<27) {
				playerBB[i] = "紅心"+(playerB[i]-13);
			}else if(t<40) {
				playerBB[i] = "方塊"+(playerB[i]-26);
			}else {
				playerBB[i] = "梅花"+(playerB[i]-39);
			}
		}
	// C hand
		for(int i =0 ; i<13; i++) {
			int t = playerC[i];
			if(t<14) {
				playerCC[i] = "黑桃"+playerC[i];
			}else if(t<27) {
				playerCC[i] = "紅心"+(playerC[i]-13);
			}else if(t<40) {
				playerCC[i] = "方塊"+(playerC[i]-26);
			}else {
				playerCC[i] = "梅花"+(playerC[i]-39);
			}
		}
	// D hand
		for(int i =0 ; i<13; i++) {
			int t = playerD[i];
			if(t<14) {
				playerDD[i] = "黑桃"+playerD[i];
			}else if(t<27) {
				playerDD[i] = "紅心"+(playerD[i]-13);
			}else if(t<40) {
				playerDD[i] = "方塊"+(playerD[i]-26);
			}else {
				playerDD[i] = "梅花"+(playerD[i]-39);
			}
		}
		
	//  Show hands
		 
		System.out.println("player A card   player B card   player C card   player D card ");
		for(int i= 0; i <13; i++) {
			System.out.print(playerAA[i] + "\t\t");
			System.out.print(playerBB[i] + "\t\t");
			System.out.print(playerCC[i] + "\t\t");
			System.out.print(playerDD[i] + "\t\t");
			System.out.println();
		}
		
	}
}
