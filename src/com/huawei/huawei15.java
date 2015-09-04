package com.huawei;

import java.util.Scanner;

/**
 * 输入一个日期，输出这是这一年的第几天。（题目中没有给出闰年的定义）

输入 20131231
输出 365
 * @author jy7788
 *
 */
public class huawei15 {

	private static int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String str=in.next();
		System.out.println(run(str));
	}
	
	public static int run(String str){
		int year=Integer.parseInt(str.substring(0, 4));
		int month=Integer.parseInt(str.substring(4, 6));
		int day=Integer.parseInt(str.substring(6));
		int result=0;
		boolean flog=judge(year);
		if(flog){
			arr[2]=29;
			
		}else{
			arr[2]=28;
		}
		for(int i=1;i<month;++i){
			result +=arr[i];
		}
		result+=day;
		return result;
	}
	
	public static boolean judge(int year){
		if(year%4==0&&year%100!=0||(year%100==0&&year%400==0)){
			return true;
		}else
			return false;
	}

}
