package Step9;

import java.util.Scanner;

public class Euclid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int gcdNum = 0;
		if(a >= b) {
			gcdNum = gcd(a, b);
		} else {
			gcdNum = gcd(b, a);
		}
		// 최소 공배수 구하는 식 a * b / gcd
		int lcmNum = a * (b / gcdNum);
		System.out.println(gcdNum + " " + lcmNum);
	}
	// 최대 공약수 구하는 재귀함수 
	public static int gcd (int a, int b) {
		if (a % b == 0) 
			return b;
		else 
			return gcd(b, a % b);
	}
}