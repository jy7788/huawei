package com.train;

import java.util.Scanner;

/**
 * ����д��ĸת�������ӦСд��ĸ��ĵ������ĸ������z�Ĵ�ͷ��ʼ����
 * ��д+32=Сд
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
