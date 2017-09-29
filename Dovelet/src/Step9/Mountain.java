package Step9;

import java.util.Scanner;

public class Mountain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		upDown(n, 1);
	}
	
	public static void upDown(int n, int flag) {
		System.out.print(flag);
		if(n != flag) {
			upDown(n, flag + 1);
			System.out.print(flag);
		}
	}
}
