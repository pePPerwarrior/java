package tw.org.iii.tutor;

import java.util.Scanner;

public class pw02 {

	public static void main(String[] args) {
		// 1.輸入
		Scanner	scanner = new Scanner(System.in);
		System.out.println("pls enter two numbers");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.printf("%d + %d = %d \n", x ,y , x + y);
		System.out.printf("%d - %d = %d \n", x ,y , x - y);
		System.out.printf("%d * %d = %d \n", x ,y , x * y);
		System.out.printf("%d / %d = %d...%d ", x ,y , x / y, x % y);

		

	}

}
