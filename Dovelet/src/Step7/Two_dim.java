package Step7;
import java.util.Scanner;

public class Two_dim {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][4];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}