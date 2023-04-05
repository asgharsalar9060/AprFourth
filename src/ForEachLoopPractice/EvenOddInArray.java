package ForEachLoopPractice;

public class EvenOddInArray {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14, 15, 16 };

//		for (int a : arr) {
//			if (a % 2 == 0) {
//				System.out.println("Even " + a);
//			} else if (a % 2 != 0) {
//				System.out.println("Odd " + a);
//			}
//		}

		evenOddNum(arr);
		oddEvenNum(arr);
	}

	public static void evenOddNum(int[] num) {
		int even = 0;
		int odd = 0;
		for (int a : num) {
			if (a % 2 == 0) {
				even++;
			} else if (a % 2 != 0) {
				odd++;
			}
		}
		System.out.println("Even count with FOR EACH LOOP " + even);
		System.out.println("Odd count with FOR EACH LOOP " + odd);
	}

	public static void oddEvenNum(int[] arr) {
		int odd = 0, even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else if (arr[i] % 2 == 1) {
				odd++;
			}
		}
		System.out.println("Even count with FOR LOOP " + even);
		System.out.println("Odd count with FOR LOOP " + odd);
	}

}
