package Task_Pakage;

public class Task_Umberla {

	public static void main(String[] args) {
		String str = "umbrella";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				System.out.println(" 'e' is the word at the index of " + i);

			} else {
				continue;
			}
		}
	}

}
