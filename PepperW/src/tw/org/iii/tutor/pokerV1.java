package tw.org.iii.tutor;

public class pokerV1 {

	public static void main(String[] args) {
		int poker [] = new int [52];
		long start = System.currentTimeMillis();
		for(int i = 0; i < 52; i++) {
			int temp = (int)(Math.random() * 52);
			
			//check 
			
			boolean isRepeat = false;
			
			for (int j = 0; j < i ; j++) {
				if (temp == poker [j]) {
					isRepeat = true;
					break;
				}
			}
			if(!isRepeat) {
				poker[i] = temp ;				
			}else {
				continue;
			}
			
			
			System.out.println(poker[i]);
		}
	System.out.println(System.currentTimeMillis() - start);
	System.out.println(System.currentTimeMillis() );
	System.out.println(start);
	}

}
