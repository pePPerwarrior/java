package tw.org.iii.tutor;

public class ptc01 {

	public static void main(String[] args) {
		int x,y,z;
		
		for(int i = 1;i < 11;i++) {
			for(x = 1; x < 10; x++) {
				for(y = 0; y < 10; y++) {
					for(z = 0; z < 10; z++) {
						int total = 100*x + 10*y + z;
						double test_num = Math.pow(x, i)+Math.pow(y, i)+Math.pow(z, i);
						if(test_num == total) {
							System.out.println(total);							
						}
						
						
					}
				}
			}
			
		}
		
	}

}
