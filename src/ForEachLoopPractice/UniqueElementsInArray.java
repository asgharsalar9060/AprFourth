package ForEachLoopPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueElementsInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 12, 12, 13, 14, 13 };

//		 HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
//		 for (int j = 0; j < arr.length; j++) {   
//	            hashmap.put(arr[j], j);   
//	        }      
//	        System.out.println(hashmap.keySet()); 

		uniqueElements(arr);
		uniqueElements2(arr);

	}

	public static void uniqueElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}

	public static void uniqueElements2(int[] arr) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i : arr) {
			hashmap.put(i, i);
		}
		System.out.println(hashmap.keySet());
	}

}
