package Step7;
import java.util.Scanner;

public class Ddm {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int flag = 0;
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += Math.abs(arr[i][j]);
			}
			sum = sum - Math.abs(arr[i][i]);
			if(Math.abs(arr[i][i]) >= sum) {
				flag++;
			}
		}
		
		if (flag == 5) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}
}