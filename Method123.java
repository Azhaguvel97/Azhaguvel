package org.method;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Method123 {

	public static void main(String[] args) {
		String s="azhaguee";
		int count1=0;
		char[] ch = s.toCharArray();
		Map<Character,Integer>m=new LinkedHashMap<Character, Integer>();
		for (char ch1 : ch) {
			if ((ch1=='a'|| ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')) {
				
			
			if (!m.containsKey(ch1)) {
				m.put(ch1, 1);
				}
			else{
				int count=m.get(ch1);
				m.put(ch1, count+1);
			}
		}
			}
		Set<Entry<Character, Integer>> m1 = m.entrySet();
		for (Entry<Character, Integer> m2 : m1) {
		
//				System.out.println(m2);
				count1++;
				System.out.println(count1++);
		}
		
}
}