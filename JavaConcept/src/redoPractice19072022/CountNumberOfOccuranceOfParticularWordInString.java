package redoPractice19072022;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccuranceOfParticularWordInString {

	public static void main(String[] args) {
		String str ="a cat a dog a rat a cat";
		
		String[] str1 = str.split(" ");
		
		Map<String,Integer> m= new HashMap<String,Integer>();
		for(String a : str1) {
			if(m.containsKey(a)) {
				m.put(a, m.get(a)+1);
			}
			else {
				m.put(a, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
			
		}

	}

}
