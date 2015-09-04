package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个整数，如12336544，或1750，
 * 然后从最后一位开始倒过来输出，
 * 最后如果是0，则不输出，输出的数字是不带重复数字的，
 * 所以上面的输出是456321和571。
 * 如果是负数，比如输入-175，输出-571。
 * @author jy7788
 *
 */
public class huawei26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String a = in.next();
		List<String> list= run(a);
		for(String c:list){
			System.out.print(c);
		}
	}
	
	public static List<String> run(String a){
		List<String> list = new ArrayList<String>();
		if(a.startsWith("-")){
			list.add("-");
			a = a.substring(1);
		}
		while(a.endsWith("0")){
			a = a.substring(0, a.length()-1);
		}
		char[] arr = a.toCharArray();
		list.add(arr[arr.length-1]+"");
		for(int i=arr.length-2;i>=0;--i){
			if(!list.get(list.size()-1).equals(arr[i]+"")){
				list.add(arr[i]+"");
			}
		}
		return list;
		
	}

}
