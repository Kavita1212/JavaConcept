package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaximumNumberWordsInSentence {

	public static void main(String[] args) {
		String[] sentence = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

		int count = 0;
		for (int i = 0; i < sentence.length; i++) {

			String[] sen = sentence[i].split(" ");
			count = Math.max(count, sen.length);

		}
		System.out.println(count);
	}
}