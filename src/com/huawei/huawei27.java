package com.huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 输入两行字符串正整数，
 * 第一行是被减数，第二行是减数，
 * 输出第一行减去第二行的结果。  
 * 备注：1、两个整数都是正整数，被减数大于减数
 * @author jy7788
 *
 */
public class huawei27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		System.out.println(a.subtract(b));
	}

}
