package Step12;

public class Alpha {
	public static void main(String[] args) {
		char[] alpha = new char[26];
		char input = 'A';
		for(int i=0;i<26;i++) {
			alpha[i] = input;
			input++;
		}
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				for(int k = 0; k < 26; k++) {
					System.out.print(alpha[i]);
					System.out.print(alpha[j]);
					System.out.print(alpha[k]);
					System.out.print(" ");
				}
			}
		}
	}
}