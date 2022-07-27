package binarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };

		char target = 'a';
		char op = nextGreatestLetter(letters, target);
		System.out.println(op);

	}

	public static char nextGreatestLetter(char[] letters, char target) {

		int s = 0;
		int e = letters.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (target > letters[mid]) {
				s = mid + 1;
			} else if (target < letters[mid]) {
				e = mid - 1;
			}
		}
		return letters[s % letters.length];
	}

}
