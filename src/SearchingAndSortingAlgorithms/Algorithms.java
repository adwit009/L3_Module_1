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

//	public static Object sortDNA(List<String> list) {
//		List<String> copy = list;
//		int x = list.size();
//		int storage = 0;
//		List<String> end = new ArrayList<String>();
//		String low = copy.get(0);
//		for (int y = 0; y <copy.size(); y++) {
//			
//		for (int i = 0; i < x; i++) {
//			if (copy.get(i).length()<low.length()) {
//				low = copy.get(i);
//				storage = i; 
//System.out.println(storage + low);
//			}
//		}
//		end.add(low);
//	copy.remove(storage);
//		
//		System.out.println(x + copy.size());
//		low = copy.get(0);
//		}
//		
//		return end;
//	}

//	public static List<Double> sortScores(List<Double> results) {
//		// TODO Auto-generated method stub
//		 Collections.sort(results);
//		
//		return results;
//	}

	

	
	
	
	
	//Add other methods here
}