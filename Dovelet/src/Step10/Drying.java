package Step10;

import java.util.Scanner;

public class Drying {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] ai = new int[n];
		
		for (int i = 0; i < n; i++) {
			ai[i] = scanner.nextInt();
		}
		
		int k = scanner.nextInt();
		
		int count = 0;

		while (true) {		
			int breakIndex = 0;
			int max = ai[0];
			int maxIndex = 0;
			for(int i = 1; i < n; i++) {
				if(max <= ai[i]) {
					max = ai[i];
					maxIndex = i;
				}
			}
			for(int i = 0; i < n; i++) {
				if (i == maxIndex) {
					ai[i] -= k;
				} else {
					ai[i]--;
				}
			}
			for (int i = 0; i < n; i++) {
				if(ai[i] <= 0) {
					breakIndex++;
				}
			}
			count++;
			if (breakIndex == n) {
				break;
			}
		}
		System.out.println(count);
	}
}
