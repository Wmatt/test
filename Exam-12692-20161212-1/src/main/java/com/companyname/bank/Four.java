package com.companyname.bank;

import java.util.*;

import java.util.Random;

public class Four {
public static void main(String[] args) {
	List<Long> list=new ArrayList();
	Map<Long, Long> map=new HashMap<Long, Long>();
	for (int i = 0; i < 50; i++) {
	list.add(Math.round((Math.random()*100)));
	}
	for (int j = 0; j < list.size(); j++) {
		map.put(list.get(j), (long) Math.floor(list.get(j)/10));
	}
	
	
System.out.println(map.values());
	}
	
}

