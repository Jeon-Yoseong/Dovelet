package Step9;

import java.util.Scanner;

public class Tobin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		print(n);
	}
	public static void print(int n) {
		// n이 0 이나 1이 되는 경우 0 또는 1 출력 
		if (n == 1)  {
			System.out.print(1);
		} else if (n == 0) { 
			System.out.print(0);
		} else {
			// 그 외의 경우 n을 2로 나눈 나머지 출력하고 n/2의 값을 재귀로 넣어준다.
			print(n / 2);
			System.out.print(n % 2);
		}
	}
}