package com.bridgelab.linkedListPractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void givenSentenceFindFrequencyOfWordsTest() {
		String sentence = "to be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		boolean result = (2 == myHashMap.get("to")) && (2 == myHashMap.get("be")) && (1 == myHashMap.get("or"))
				&& (1 == myHashMap.get("not"));
		assertTrue(result);
	}

	@Test
	public void givenSentenceFindFrequencyInLageParagrahTest() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		boolean result = (3 == myHashMap.get("paranoid"));
		assertTrue(result);
	}
	
	@Test
	public void givenSentenceRemoveAvoidableFromParagrahTest() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		myHashMap.remove("avoidable");
		boolean result = (null == myHashMap.get("avoidable"));
		assertTrue(result);
	}
}
