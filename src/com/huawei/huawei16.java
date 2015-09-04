package com.huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 第一题的题目大概是输入整型数组求数组的最小数和最大数之和，例如输入1,2,3,4则输出为5，当输入只有一个数的时候，则最小数和最大数都是该数，例如只输入1，则输出为2；另外数组的长度不超过50
 * @author jy7788
 *
 */
public class huawei16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String str=in.next();
		String[] arr=str.split(",");
		System.out.println(run(arr));
	}
	
	public static int run(String[] arr){
		int min=Integer.parseInt(arr[0]);
		int max=min;
		for(int i=1;i<arr.length;++i){
			if(Integer.parseInt(arr[i])<min)
				min=Integer.parseInt(arr[i]);
			if(Integer.parseInt(arr[i])>max)
				max=Integer.parseInt(arr[i]);
		}
		return min+max;
	}

}
