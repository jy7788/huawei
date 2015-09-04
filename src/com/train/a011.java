package com.train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<10;++i){
			map.put(i, 0);
		}
		char[] chars = str.toCharArray();
		for(char c:chars){
			int key = (int)c-48;
			int tmp = map.get(key)+1;
			map.put(key, tmp);
		}
		for(int i=0;i<10;++i){
			if(map.get(i)>0)
				System.out.println(i+":"+map.get(i));
		}
	}

}
