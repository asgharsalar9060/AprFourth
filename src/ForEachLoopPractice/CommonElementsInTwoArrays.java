package ForEachLoopPractice;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 6, 7, 8 };

		commonElements(arr1, arr2);
		commonElementsWithHashSet(arr1, arr2);
		commonElementsWithHashSetAndForEachLoop(arr1, arr2);
		
	}

	// Using for loop
	public static void commonElements(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	// Using for loop with hashset
	public static void commonElementsWithHashSet(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					set.add(arr1[i]);
				}
			}
		}
		for(int s : set) {
			System.out.println(s);
		}
	}
	
	// Using for each loop with hashset
	public static void commonElementsWithHashSetAndForEachLoop(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int a1 : arr1) {
			set1.add(a1);
		}
		for(int a2 : arr2) {
			set2.add(a2);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
