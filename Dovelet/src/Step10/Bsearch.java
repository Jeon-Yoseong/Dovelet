package Step10;

import java.util.Scanner;

public class Bsearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int searchNum = scanner.nextInt();
	
		if (binary(n, arr, searchNum) == -1) {
			System.out.println("not found");
		} else {
			System.out.println(binary(n, arr, searchNum));
		}
		
	
	}
	public static int binary(int n, int[] arr, int searchNum) {
		
		int start = 0;
		int end = n - 1;
		int mid;
		
		while (start <= end) {
			mid = (start + end) / 2;
			
			if (arr[mid] == searchNum) {
				return mid+1;
			} else if(arr[mid] > searchNum) {
				end = mid - 1;
			} else if (arr[mid] < searchNum) {
				start = mid + 1;
			}
		}
		return -1;
	}

}
