package Step8;

import java.util.Scanner;

public class Goldbach {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] arr = new int[num];
		arr = getChe(num);
		int flag = 0;
		int i = 3;
		for(i = 3; i < num; i++) {
			if(arr[i] != 0) {
				int answer = num - arr[i];
				for (int j = i; j < num; j++) {
					if(answer == arr[j]) {
						System.out.println(num + " = "+arr[i] + " + " + answer);
						flag = 1;
						break;
					}
				}
			}
			if (flag == 1) {
				break;
			}
		}
		if (i == num) {
			System.out.println("Goldbach's conjecture is wrong.");
		}
	}
	
	private static int[] getChe (int num) {
		int[] arr = new int[num];
		
		for(int i = 2; i < num; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < num; i++) {
			if (arr[i] == 0) {
				continue;
			}
			for (int j = i+i; j < num; j += i) {
				arr[j] = 0;
			}
		}
		
		return arr;
	}
}
