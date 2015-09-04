package com.huawei;

import java.util.Scanner;

/**
 * 输入一串数，以','分隔，输出所有数中去掉最大值、最小值之后剩下的个数。
 * （其中最大值与最小值可能有多个）  Smple input：3,3,5,3,6,9,7,9   Sample outPut: 3
 * @author jy7788
 *
 */
public class huawei20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(acculateCount(str));
	}
	
	public static int acculateCount(String str){
		String[] arr = str.split(",");
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;++i){
			Integer num = Integer.parseInt(arr[i]);
			if(num<min){
				min = num;
			}else{
				if(num>max)
					max = num;
			}
		}
		int count = arr.length;
		for(int i=0;i<arr.length;++i){
			Integer num = Integer.parseInt(arr[i]);
			if(num.equals(min)||num.equals(max)){
				count--;
			}
		}
		return count;
	}

}
