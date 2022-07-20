package redoPractice19072022;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1000);
		l.add(30);
		l.add(1);
		l.add(1);
		
		for (int i = 0; i < l.size(); i++) {
			for (int j = i+1; j < l.size(); j++) {
				if(l.get(i)>l.get(j)) {
					Integer temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
System.out.println(l);
	}

}
