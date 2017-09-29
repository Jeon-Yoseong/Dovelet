package Step12;

import java.util.Scanner;

public class Counting_Black {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] map = new int[100][100];
		
		int t = scanner.nextInt();
		int[] testCount = new int[t];
		for(int i = 0; i < t; i++) {
			String color = scanner.next();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int L = scanner.nextInt();
			int countNum = 0;
			if(!color.equals("TEST")) {
				for (int j = x-1; j < x+L-1; j++) {
					for (int k = y-1; k < y+L-1; k++) {
						if(color.equals("BLACK")) {
							map[j][k] = 1;
						} else {
							map[j][k] = 0;
						}
					}
				}
			} else {
				for( int j = 0; j < L; j++) {
					for (int k = 0; k < L; k++) {
						if (map[j][k] == 1) {
							countNum++;
						}
					}
				}
				testCount[i] = countNum;
			}
		}
	
		for (int i = 0; i < t; i++) {
			if(testCount[i] != 0) {
				System.out.println(testCount[i]);
			}
		}
		
	}
}
