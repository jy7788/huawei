package com.huawei;

import java.util.Scanner;

/**
 * ��Ŀһ����ƻ��
M����ͬƻ���ŵ�N����ͬ�������ж����ַŷ�,���������Ӳ��š�
1<=M<=10��1<=N<=10
����5��ƻ���������ӣ�3��1��1 �� 1,1,3��ͬһ�ַŷ�

���� 7 3
��� 8
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
