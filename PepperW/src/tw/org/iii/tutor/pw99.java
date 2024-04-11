package tw.org.iii.tutor;

public class pw99 {

	public static void main(String[] args) {
		for(int z = 0; z < 2; z++) {
			for(int i = 1; i < 10; i++) {
				for(int j = 2; j < 6; j++) {
					System.out.printf("%d * %d = %d\t",j + z * 4 ,i,i*(j + z * 4));
					}
				System.out.print("\n");
				}
			System.out.println();
		}
	}		
}

