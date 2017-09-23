package Step7;

import java.util.Scanner;

public class Pascal_tri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int n = scanner.nextInt();
		int[][] arr = new int[n][n];	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					arr[i][j] = 1;
				} else if (j > 0 && j < i) {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				} else {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}