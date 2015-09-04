package com.huawei;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 输入：              字符串
输出：              去除重复字符并排序的字符串
样例输入：       aabcdefff
样例输出：       abcdef
 * @author jy7788
 *
 */
public class huawei6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.next();
		run(str);

	}

	public static void run(String str){
		char[] array=str.toCharArray();
		Arrays.sort(array);
		char tmp=array[0];
		String result=""+array[0];
		for(int i=1;i<array.length;++i){
			if(array[i]!=tmp){
				result +=array[i];
				tmp=array[i];
			}
		}
		System.out.println(result);
		return;
	}
}
