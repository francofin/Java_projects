package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("hello", "A formal greeting used to greet persons");
		dictionary.put("joy", "Happines and good natured feeling");
		dictionary.put("genius","showing great intellignece, understands and grasps concepts very quickly");
		
		
		for(String word: dictionary.keySet()) {
			System.out.println(word+"-----"+dictionary.get(word));
		}
		
		System.out.println("--------------------------------------------------");
		
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		TreeMap<String, String> dictionary2 = new TreeMap<String, String>();
		dictionary2.put("hello", "A formal greeting used to greet persons");
		dictionary2.put("joy", "Happines and good natured feeling");
		dictionary2.put("genius","showing great intellignece, understands and grasps concepts very quickly");
		
		System.out.println("--------------------------------------------------");
		
		for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
