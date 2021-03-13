package com.skill.capg.lab6;
import java.awt.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Collections;  
import java.util.Comparator; 
import java.util.*; 
import java.lang.*; 

import java.util.HashMap;
import java.util.*; 

public class Exercise1 {
	static void getValue()  {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("A", 3);
		map.put("B", 2);
		map.put("C", 1);
		map.put("D", 5);
		map.put("E", 4);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Integer i: map.values()) {
			list.add(i);
		}
		Collections.sort(list);
		for(Integer i : list) System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		getValue();
}
}