package Step9;

import java.util.Scanner;

public class Powerofx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(pow(x, y));
		
	}
	public static int pow(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return x * pow(x, y - 1);
		}
	}
}