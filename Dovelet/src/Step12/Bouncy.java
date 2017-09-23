package Step12;

import java.util.ArrayList;
import java.util.Scanner;

public class Bouncy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr;
		ArrayList<String> answer = new ArrayList<>();
		while(true) {
			String input = scanner.nextLine();
			if(input.length() > 9) {
				break;
			}
			arr = new int[input.length()];
			for(int i = 0; i < input.length(); i++) {
				arr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
			}
			int upCount = 0;
			int downCount = 0;
			int flag = arr[0];
			
			for (int i = 1; i < arr.length; i++) {
				if(arr[i] >= flag) {
					flag = arr[i];
					upCount++;
				}
			}
			
			for (int i = 1; i < arr.length; i++) {
				if(arr[i] <= flag) {
					flag = arr[i];
					downCount++;
				}
			}

			if(input.equals("0")) {
				break;
			}
			if((upCount == input.length() -1) || (downCount == input.length() -1)) {
				answer.add("no bouncy");
				//System.out.println("no bouncy");
			} else {
				answer.add("bouncy");
				//System.out.println("bouncy");
			}
		}
		for(int i = 0; i < answer.size(); i++) {
			if (answer.get(i).equals("no bouncy")) {
				System.out.println("no bouncy");
			} else if (answer.get(i).equals("bouncy")) {
				System.out.println("bouncy");
			}
		}
	}
} 