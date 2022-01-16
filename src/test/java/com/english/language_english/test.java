package com.english.language_english;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class test {
	
	
	public static void main(String... args) {
	HashMap<String,Integer> map = new HashMap<>();
	map.put(null, null);
	map.put(null, null);
	map.put("Sourabh", 25);
	map.put("utkhade", 26);
	map.put("ankita", 30);
	map.put("mohan", 90);
	System.out.println(map.containsKey("mohan"));
	
	Map.Entry<String,Integer> entry = (Entry<String, Integer>) map.entrySet();
	Set<String> s = map.keySet();
	System.out.println(s);
	}
}
