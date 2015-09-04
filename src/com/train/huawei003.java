package com.train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class huawei003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String king = "joker JOKER";
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("3", 1);
		map.put("4", 2);
		map.put("5", 3);
		map.put("6", 4);
		map.put("7", 5);
		map.put("8", 6);
		map.put("9", 7);
		map.put("10", 8);
		map.put("J", 9);
		map.put("Q", 10);
		map.put("K", 11);
		map.put("A", 12);
		map.put("2", 13);
		map.put("joker", 14);
		map.put("JOKER", 15);
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String a = str.substring(0, str.indexOf("-"));
			String b = str.substring(str.indexOf("-")+1);
			String[] arr_a = a.split(" ");
			String[] arr_b = b.split(" ");
			if(a.equals(king)||b.equals(king)){
				System.out.println(king);//王炸的情况
			}else{
				if(arr_a.length!=arr_b.length){
					if(arr_a.length==4){
						System.out.println(a);
					}else{
						if(arr_b.length==4){
							System.out.println(b);
						}else{
							//双方都没有炸弹和王炸且牌数不等
							System.out.println("ERROR");
						}
					}
				}else{
					if(arr_a.length==5){
						if(map.get(arr_a[2])>map.get(arr_b[2])){
							System.out.println(a);
						}else{
							System.out.println(b);
						}
					}else{
						if(map.get(arr_a[0])>map.get(arr_b[0])){
							System.out.println(a);
						}else{
							System.out.println(b);
						}
					}	
				}
			}
		}
		
	}

}
