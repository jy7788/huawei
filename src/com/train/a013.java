package com.train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<10;++i){
			map.put(i, 0);
		}
		for(int i=0;i<10;++i){
			map.put(i,in.nextInt());
		}
		for(int i=1;i<10;++i){
			if(map.get(i)>0){
				System.out.print(i);
				map.put(i, map.get(i)-1);
				break;
			}
		}
		for(int i=0;i<map.get(0);++i){
			System.out.print(0);
		}
		for(int i=1;i<10;++i){
			if(map.get(i)>0){
				for(int j=0;j<map.get(i);++j){
					System.out.print(i);
				}
			}
		}
	}

}
