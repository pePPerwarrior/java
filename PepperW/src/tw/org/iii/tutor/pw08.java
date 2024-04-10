package tw.org.iii.tutor;

public class pw08 {

	public static void main(String[] args) {
		int a = 0;
		for(printPW() ;a<10 ; printLine()){
			System.out.println(a++);
		}
	}
	
	static void printPW() {
		System.out.println("PW");
	}
	static void printLine() {
		System.out.println("------");
	}

}
