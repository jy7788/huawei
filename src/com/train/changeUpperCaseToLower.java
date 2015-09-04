package com.train;

import java.util.Scanner;

/**
 * 将大写字母转换成其对应小写字母后的第五个字母，大于z的从头开始数。
 * 大写+32=小写
 * @author jy7788
 *
 */
public class changeUpperCaseToLower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char c = str.charAt(0);
		char d = (char)(c+32+5);
		if(d>122){
			d = (char)(d-26);
		}
		System.out.println(d);
	}
}
