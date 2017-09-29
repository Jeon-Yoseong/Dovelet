package Step12;

import java.util.Scanner;

public class Crypt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] alpha = new char[26];
		String temp = scanner.nextLine();
		for (int i = 0; i < 26; i++) {
			alpha[i] = temp.charAt(i);
		}
		temp = scanner.nextLine();
		char[] message = new char[temp.length()];
		
		for (int i = 0; i < temp.length(); i++) {
			message[i] = temp.charAt(i);
		}
		
		for (int i = 0; i < message.length; i++) {
			if (message[i] >= 97 && message[i] <= 122) {
				System.out.print(alpha[message[i]-97]);
			} else if (message[i] >= 65 && message[i] <= 90) {
				char tempChar = (char) (alpha[message[i]-65] - 32);
				System.out.print(tempChar);
			} else if (message[i] == 32) {
				System.out.print(" ");
			}
		}	
	}
}
