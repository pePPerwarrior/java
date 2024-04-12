package tw.org.iii.tutor;

public class pokerV2 {

	public static void main(String[] args) {
		int poker [] = new int [52];
		boolean isRepeat;
		int temp;
		long start = System.currentTimeMillis();
		for(int i = 0; i < 52; i++) {
			do {
				temp = (int)(Math.random() * 52);
				
				//check 
				
				isRepeat = false;
				
				for (int j = 0; j < i ; j++) {
					if (temp == poker [j]) {
						isRepeat = true;
						break;
					}
				}				
			}while(isRepeat);
			
		
			poker[i] = temp ;		
			System.out.println(poker[i]);
		}
		
	System.out.println(System.currentTimeMillis() - start);
	
	}

}
