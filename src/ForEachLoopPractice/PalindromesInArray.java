package ForEachLoopPractice;

public class PalindromesInArray {

	public static void main(String[] args) {
		String[] arr = { "anna", "level", "java", "mom" };

		System.out.println(palindromeString(arr));

	}

	public static boolean isPalindrome(String str) {
		int a = 0;
		int b = str.length() - 1;
		
		while(b > a) {
			if(str.charAt(a++) != str.charAt(b--)) {
				return false;
			}
		}
		return true;
	}

	public static int palindromeString(String[] arr) {
		int n = 0;

		for (String i : arr) {
			if (isPalindrome(i)) {
				n++;
			}
		}
		return n;
	}

}
