package com.huawei;

import java.util.Scanner;

/**
 * 题目一、分苹果
M个相同苹果放到N个相同篮子里有多少种放法,允许有篮子不放。
1<=M<=10，1<=N<=10
例如5个苹果三个篮子，3，1，1 和 1,1,3是同一种放法

输入 7 3
输出 8
 * @author jy7788
 *
 */
public class huawei14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		System.out.println(run(m,n));
	}
	
	public static int run(int m,int n){
		if(m==1||n==1) return 1;
		if(m<n){
			return run(m,m);
		}else{
			if(m>n){
				return run(m-n,n)+run(m,n-1);
			}else{
				return 1+run(m,n-1);
			}
		}
	}

}
