package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
	int x = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				x++;
			}
		}
		
		return x;
	}

	public static double findTallest(List<Double> peeps) {
	double x = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			
			if (x<peeps.get(i)) {
				x = peeps.get(i);
			}
		}
		
		return x;
	}

	public static String findLongestWord(List<String> words) {
		int x = (words.get(0)).length();
		int storage = 0;
		for (int i = 0; i < words.size(); i++) {
			if (x<(words.get(i)).length()) {
				x = (words.get(i)).length();
				storage = i;
			
			}
		}
	
		return words.get(storage);
	}

	public static boolean containsSOS(List<String>message) {
		String x = " ... --- ... ";
		
			if (message.contains(x)) {
				return true;
			}
	
		
				
			return false ;
		
	}

	public static Object sortDNA(List<String> list) {

		for (int y = 0; y < (list.size()) ; y++) {
			
			for (int i = 0; i < list.size()-1; i++) {
				if (list.get(i).length()>list.get(i+1).length()) {
					String store = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, store);
			
			
				
				}
		
			}
		}
		
		
		return list;
	}

	public static List<Double> sortScores(List<Double> list) {
	for (int y = 0; y < (list.size()) ; y++) {
			
			for (int i = 0; i < list.size()-1; i++) {
				if (list.get(i)>list.get(i+1)) {
					double store = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, store);
			
				
				
				}
				
			}
		}
		
		
		return list;
		//different and easier method 
//		 Collections.sort(results);
//		
//		return results;
	}

	public static List<String> sortWords(List<String> list) {
		for (int y = 0; y < (list.size()) ; y++) {
			
			for (int i = 0; i < list.size()-1; i++) {
				if ((list.get(i)).compareTo(list.get(i+1)) > 0) {
					String store = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, store);
					for (int j = 0; j < list.size(); j++) {
						
						System.out.print(list.get(i));
					}
				}
			System.out.println();
			}
		}
		
		
		return list;
	}

	

	
	
	
	
	//Add other methods here
}