package com.huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ��һ�����Ŀ��������������������������С���������֮�ͣ���������1,2,3,4�����Ϊ5��������ֻ��һ������ʱ������С������������Ǹ���������ֻ����1�������Ϊ2����������ĳ��Ȳ�����50
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
