package tw.org.iii.tutor;

public class pw12 {

	public static void main(String[] args) {
		
			int[] p = new int[6] ;
			int diceNum = 0;
			
			for(int i = 1 ; i < 1000000 ; i++) {
				diceNum = (int)(Math.random()*9+1);
				//System.out.println(diceNum);
				p[diceNum < 7 ? diceNum-1: diceNum -4] ++ ;
			}
			
			for (int i = 0; i < p.length; i++) {
				System.out.printf("%d appears %d times \n", i+1, p[i]);
			}
						
			
			System.out.println(diceNum);

		}

	}


