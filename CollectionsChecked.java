package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionsChecked {

	public static void main(String[] args) {
		
		/*
		 * Collections.checkedMap(Map,Key.class,Value.class);
		 * Collections.checkedList(List,T.class);
		 * Collections.checkedNavigableMap(Map,Key.class,Value.class);
		 * Collections.checkedNavigableSet(Set,T.class);
		 * Collections.checkedQueue(Queue,T.class);
		 * Collections.checkedSet(Set,T.class);
		 * Collections.checkedSortedMap(Map,Key.class,Value.class);
		 * Collections.checkedSortedSet(Set,T.class);
		 */
		Map<String,Integer> stringVsInteger=new HashMap<>();
		Collections.checkedMap(stringVsInteger, String.class, Integer.class);

		List<String> string=new ArrayList<>();
		Collections.checkedList(string, String.class);

		NavigableMap<String,Integer> map=new TreeMap<>();
		Collections.checkedNavigableMap(map, String.class, Integer.class);
		
		NavigableSet<Integer> set=new TreeSet<>();
		Collections.checkedNavigableSet(set, Integer.class);
		
		Queue<Integer> queue=new ConcurrentLinkedQueue<Integer>();
		Collections.checkedQueue(queue, Integer.class);
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		Collections.checkedSet(hashSet, Integer.class);
		
		SortedMap<String,String> sortedMap=new TreeMap<>(); 
		Collections.checkedSortedMap(sortedMap, String.class, String.class);
		
		SortedSet<Integer> sortedSet=new TreeSet<>();
		Collections.checkedSortedSet(sortedSet, Integer.class);
		    }
		
	}
