package tw.org.iii.tutor;

public class swap {

	public static void main(String[] args) {
		int a = 10 ; int b = 3;
	
//		a = a + b; 
//		b = a - b; 
//		a = a - b; 

		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
				
				
//		int temp;
//		temp = a;
//		a = b ;
//		b = temp;
		
		
		System.out.printf("a = %d , b = %d" ,a,b);
	}

}
