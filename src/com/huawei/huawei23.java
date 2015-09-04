package com.huawei;

import java.util.Scanner;

/**
 * ╩ьнд
 * @author jy7788
 *
 */
public class huawei23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String str = in.next();
		if(run(str)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
	
	public static boolean run(String str){
		char[] tmp = str.toCharArray();
		int middle=tmp.length/2-1;
		for(int i=0;i<=middle;++i){
			if(tmp[tmp.length-1-i]!=tmp[i]){
				return false;
			}
		}
		return true;
	}

}
