package redoPractice19072022;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueValuesUsingJavaStream {

	public static void main(String[] args) {
		/*
		 * String s ="helloh";//eo char[] a =s.toCharArray();
		 * 
		 * List<char[]> list =Arrays.asList(a);
		 * //list.stream().distinct().forEach(System.out::println); List<char[]> op =
		 * list.stream().distinct().collect(Collectors.toList());
		 * System.out.println(String.valueOf(op));
		 */
		//Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		/*
		 * Collection<String> list = Arrays.asList("h", "e", "l", "l", "o", "h");
		 * System.out.println(list);
		 * 
		 * // Get collection without duplicate i.e. distinct only List<String>
		 * distinctElements = list.stream() .filter(e->e.length()==1)
		 * .map(String::toLowerCase) .collect(Collectors.toList());
		 * 
		 * //Let's verify distinct elements System.out.println(distinctElements);
		 */
		
		String input ="helloh";//eo
		Character result =  input.chars()      //string stream
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
	             .entrySet().stream()
	             .filter(entry -> entry.getValue() == 1L)
	             .map(entry -> entry.getKey())
	             .findFirst().get();
		
		System.out.println(result);
		
	}

}
