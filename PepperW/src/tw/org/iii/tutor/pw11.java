package tw.org.iii.tutor;

public class pw11 {

	public static void main(String[] args) {
		int d1,d2,d3,d4,d5,d6;
		
		d1 = d2 = d3 = d4 = d5 = d6 = 0;
//		int diceNum;
		int diceNum = 0;
		for(int i = 1 ; i < 101 ; i++) {
			diceNum = (int)(Math.random()*6+1);
		}
		System.out.println(diceNum);
		
		
		
		

	}

}

