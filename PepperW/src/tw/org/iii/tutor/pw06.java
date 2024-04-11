
package tw.org.iii.tutor;

public class pw06 {

	public static void main(String[] args) {
		int year  = 1000;
		boolean isLeap;
		
		if (year % 4 == 0 ) {
			if (year % 400 == 0 || year % 1000 ==0) {
				isLeap = true;
			}else {isLeap = false;}
		}else {isLeap = false;}	
		System.out.printf("%d is %s " ,year, isLeap?"潤":"平");
	}
	
}
