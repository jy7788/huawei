package com.huawei;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一行数字：123 423 5645 875 186523  
 * 在输入第二行：23  
 * 将第一行中含有第二行中“23”的数输出并排序 结果即：123 423 186523
 * @author jy7788
 *
 */
public class huawei24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String arr = in.nextLine();
		String str = in.next();
		List<Integer> result = run(arr,str);
		System.out.print(result.get(0));
		for(int i=1;i<result.size();++i){
			System.out.print(" ");
			System.out.print(result.get(i));
		}
	}
	
	public static List<Integer> run(String a,String str){
		String[] tmp = a.split(" ");
		List<Integer> arr = new LinkedList<Integer>();
		for(int i=0;i<tmp.length;++i){
			if(tmp[i].indexOf(str)!=-1){
				arr.add(Integer.parseInt(tmp[i]));
			}
		}
		BubbleSort(arr);
		return arr;
	}
	
	public static void BubbleSort(List<Integer> arr){
		for(int i=arr.size()-1;i>=0;--i){
			for(int j=0;j<i-1;++j){
				if(arr.get(j).compareTo(arr.get(j+1))>0){
					Integer tmp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, tmp);
				}
			}
		}
	}

}
